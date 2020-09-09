// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// Version: 1.3.0.0

package com.chronoxor.fbe;

// Fast Binary Encoding UUID generator
public final class UUIDGenerator
{
    // Gregorian epoch
    private static final long GregorianEpoch = -12219292800000L;

    // Lock and random generator
    private static final Object _lock = new Object();
    private static final java.util.Random _generator = new java.util.Random();

    // Node & clock sequence bytes
    private static long _node = makeNode();
    private static long _nodeAndClockSequence = makeNodeAndClockSequence();

    // Last UUID generated timestamp
    private static long _last = GregorianEpoch;

    private static long makeNode()
    {
        return _generator.nextLong() | 0x0000010000000000L;
    }

    private static long makeNodeAndClockSequence()
    {
        long clock = _generator.nextLong();

        long lsb = 0;
        // Variant (2 bits)
        lsb |= 0x8000000000000000L;
        // Clock sequence (14 bits)
        lsb |= (clock & 0x0000000000003FFFL) << 48;
        // 6 bytes
        lsb |= _node;
        return lsb;
    }

    // Generate nil UUID0 (all bits set to zero)
    public static java.util.UUID nil() { return new java.util.UUID(0, 0); }

    // Generate sequential UUID1 (time based version)
    public static java.util.UUID sequential()
    {
        long now = System.currentTimeMillis();

        // Generate new clock sequence bytes to get rid of UUID duplicates
        synchronized(_lock)
        {
            if (now <= _last)
                _nodeAndClockSequence = makeNodeAndClockSequence();
            _last = now;
        }

        long nanosSince = (now - GregorianEpoch) * 10000;

        long msb = 0L;
        msb |= (0x00000000FFFFFFFFL & nanosSince) << 32;
        msb |= (0x0000FFFF00000000L & nanosSince) >>> 16;
        msb |= (0xFFFF000000000000L & nanosSince) >>> 48;
        // Sets the version to 1
        msb |= 0x0000000000001000L;

        return new java.util.UUID(msb, _nodeAndClockSequence);
    }

    // Generate random UUID4 (randomly or pseudo-randomly generated version)
    public static java.util.UUID random() { return java.util.UUID.randomUUID(); }
}