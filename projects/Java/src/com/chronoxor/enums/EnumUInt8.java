//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

package com.chronoxor.enums;

public final class EnumUInt8 implements Comparable<EnumUInt8>
{
    public static final EnumUInt8 ENUM_VALUE_0 = new EnumUInt8(EnumUInt8Enum.ENUM_VALUE_0);
    public static final EnumUInt8 ENUM_VALUE_1 = new EnumUInt8(EnumUInt8Enum.ENUM_VALUE_1);
    public static final EnumUInt8 ENUM_VALUE_2 = new EnumUInt8(EnumUInt8Enum.ENUM_VALUE_2);
    public static final EnumUInt8 ENUM_VALUE_3 = new EnumUInt8(EnumUInt8Enum.ENUM_VALUE_3);
    public static final EnumUInt8 ENUM_VALUE_4 = new EnumUInt8(EnumUInt8Enum.ENUM_VALUE_4);
    public static final EnumUInt8 ENUM_VALUE_5 = new EnumUInt8(EnumUInt8Enum.ENUM_VALUE_5);

    private EnumUInt8Enum value = EnumUInt8Enum.values()[0];

    public EnumUInt8() {}
    public EnumUInt8(byte value) { setEnum(value); }
    public EnumUInt8(EnumUInt8Enum value) { setEnum(value); }
    public EnumUInt8(EnumUInt8 value) { setEnum(value); }

    public EnumUInt8Enum getEnum() { return value; }
    public byte getRaw() { return value.getRaw(); }

    public void setDefault() { setEnum((byte)0); }

    public void setEnum(byte value) { this.value = EnumUInt8Enum.mapValue(value); }
    public void setEnum(EnumUInt8Enum value) { this.value = value; }
    public void setEnum(EnumUInt8 value) { this.value = value.value; }

    @Override
    public int compareTo(EnumUInt8 other)
    {
        if (value == null)
            return -1;
        if (other.value == null)
            return 1;
        return (int)(value.getRaw() - other.value.getRaw());
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!EnumUInt8.class.isAssignableFrom(other.getClass()))
            return false;

        final EnumUInt8 enm = (EnumUInt8)other;

        if ((value == null) || (enm.value == null))
            return false;
        if (value.getRaw() != enm.value.getRaw())
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        hash = hash * 31 + ((value != null) ? value.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() { return (value != null) ? value.toString() : "<unknown>"; }
}
