//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

package com.chronoxor.protoex;

public enum OrderSideEnum
{
    buy((byte)0 + 0)
    , sell((byte)0 + 1)
    , tell((byte)0 + 2)
    ;

    private byte value;

    OrderSideEnum(byte value) { this.value = value; }
    OrderSideEnum(int value) { this.value = (byte)value; }
    OrderSideEnum(OrderSideEnum value) { this.value = value.value; }

    public byte getRaw() { return value; }

    public static OrderSideEnum mapValue(byte value) { return mapping.get(value); }

    @Override
    public String toString()
    {
        if (this == buy) return "buy";
        if (this == sell) return "sell";
        if (this == tell) return "tell";
        return "<unknown>";
    }

    private static final java.util.Map<Byte, OrderSideEnum> mapping = new java.util.HashMap<>();
    static
    {
        for (var value : OrderSideEnum.values())
            mapping.put(value.value, value);
    }
}
