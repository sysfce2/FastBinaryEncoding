//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

package com.chronoxor.protoex;

public enum OrderTypeEnum
{
    market((byte)0 + 0)
    , limit((byte)0 + 1)
    , stop((byte)0 + 2)
    , stoplimit((byte)0 + 3)
    ;

    private byte value;

    OrderTypeEnum(byte value) { this.value = value; }
    OrderTypeEnum(int value) { this.value = (byte)value; }
    OrderTypeEnum(OrderTypeEnum value) { this.value = value.value; }

    public byte getRaw() { return value; }

    public static OrderTypeEnum mapValue(byte value) { return mapping.get(value); }

    @Override
    public String toString()
    {
        if (this == market) return "market";
        if (this == limit) return "limit";
        if (this == stop) return "stop";
        if (this == stoplimit) return "stoplimit";
        return "<unknown>";
    }

    private static final java.util.Map<Byte, OrderTypeEnum> mapping = new java.util.HashMap<>();
    static
    {
        for (var value : OrderTypeEnum.values())
            mapping.put(value.value, value);
    }
}
