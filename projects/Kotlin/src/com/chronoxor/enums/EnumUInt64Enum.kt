//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.enums

@Suppress("EnumEntryName", "MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
enum class EnumUInt64Enum
{
    ENUM_VALUE_0(0uL + 0u)
    , ENUM_VALUE_1(0uL + 0u)
    , ENUM_VALUE_2(0uL + 1u)
    , ENUM_VALUE_3(0xFFFFFFFFFFFFFFFEuL + 0u)
    , ENUM_VALUE_4(0xFFFFFFFFFFFFFFFEuL + 1u)
    , ENUM_VALUE_5(ENUM_VALUE_3.raw)
    ;

    var raw: ULong = 0uL
        private set

    constructor(value: UByte) { this.raw = value.toULong() }
    constructor(value: UShort) { this.raw = value.toULong() }
    constructor(value: UInt) { this.raw = value.toULong() }
    constructor(value: ULong) { this.raw = value.toULong() }
    constructor(value: EnumUInt64Enum) { this.raw = value.raw }

    override fun toString(): String
    {
        if (this == ENUM_VALUE_0) return "ENUM_VALUE_0"
        if (this == ENUM_VALUE_1) return "ENUM_VALUE_1"
        if (this == ENUM_VALUE_2) return "ENUM_VALUE_2"
        if (this == ENUM_VALUE_3) return "ENUM_VALUE_3"
        if (this == ENUM_VALUE_4) return "ENUM_VALUE_4"
        if (this == ENUM_VALUE_5) return "ENUM_VALUE_5"
        return "<unknown>"
    }

    companion object
    {
        private val mapping = java.util.HashMap<ULong, EnumUInt64Enum>()

        init
        {
            for (value in EnumUInt64Enum.values())
                mapping[value.raw] = value
        }

        fun mapValue(value: ULong): EnumUInt64Enum? { return mapping[value] }
    }
}
