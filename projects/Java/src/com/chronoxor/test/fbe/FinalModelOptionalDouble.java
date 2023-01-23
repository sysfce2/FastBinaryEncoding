//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

package com.chronoxor.test.fbe;

// Fast Binary Encoding optional Double final model
public final class FinalModelOptionalDouble extends com.chronoxor.fbe.FinalModel
{
    public FinalModelOptionalDouble(com.chronoxor.fbe.Buffer buffer, long offset)
    {
        super(buffer, offset);
        value = new com.chronoxor.fbe.FinalModelDouble(buffer, 0);
    }

    // Get the allocation size
    public long fbeAllocationSize(Double optional) { return 1 + ((optional != null) ? value.fbeAllocationSize(optional) : 0); }

    // Checks if the object contains a value
    public boolean hasValue()
    {
        if ((_buffer.getOffset() + fbeOffset() + 1) > _buffer.getSize())
            return false;

        byte fbeHasValue = readInt8(fbeOffset());
        return (fbeHasValue != 0);
    }

    // Base final model value
    public final com.chronoxor.fbe.FinalModelDouble value;

    // Check if the optional value is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + fbeOffset() + 1) > _buffer.getSize())
            return Long.MAX_VALUE;

        byte fbeHasValue = readInt8(fbeOffset());
        if (fbeHasValue == 0)
            return 1;

        _buffer.shift(fbeOffset() + 1);
        long fbeResult = value.verify();
        _buffer.unshift(fbeOffset() + 1);
        return 1 + fbeResult;
    }

    // Get the optional value
    public Double get(com.chronoxor.fbe.Size size)
    {
        assert ((_buffer.getOffset() + fbeOffset() + 1) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 1) > _buffer.getSize())
        {
            size.value = 0;
            return null;
        }

        if (!hasValue())
        {
            size.value = 1;
            return null;
        }

        _buffer.shift(fbeOffset() + 1);
        Double optional = value.get(size);
        _buffer.unshift(fbeOffset() + 1);
        size.value += 1;
        return optional;
    }

    // Set the optional value
    public long set(Double optional)
    {
        assert ((_buffer.getOffset() + fbeOffset() + 1) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 1) > _buffer.getSize())
            return 0;

        byte fbeHasValue = (byte)((optional != null) ? 1 : 0);
        write(fbeOffset(), fbeHasValue);
        if (fbeHasValue == 0)
            return 1;

        _buffer.shift(fbeOffset() + 1);
        long size = value.set(optional);
        _buffer.unshift(fbeOffset() + 1);
        return 1 + size;
    }
}
