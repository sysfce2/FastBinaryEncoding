//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.enums

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
open class Enums : Comparable<Any?>
{
    var byte0: EnumByte
    var byte1: EnumByte
    var byte2: EnumByte
    var byte3: EnumByte
    var byte4: EnumByte
    var byte5: EnumByte
    var char0: EnumChar
    var char1: EnumChar
    var char2: EnumChar
    var char3: EnumChar
    var char4: EnumChar
    var char5: EnumChar
    var wchar0: EnumWChar
    var wchar1: EnumWChar
    var wchar2: EnumWChar
    var wchar3: EnumWChar
    var wchar4: EnumWChar
    var wchar5: EnumWChar
    var int8b0: EnumInt8
    var int8b1: EnumInt8
    var int8b2: EnumInt8
    var int8b3: EnumInt8
    var int8b4: EnumInt8
    var int8b5: EnumInt8
    var uint8b0: EnumUInt8
    var uint8b1: EnumUInt8
    var uint8b2: EnumUInt8
    var uint8b3: EnumUInt8
    var uint8b4: EnumUInt8
    var uint8b5: EnumUInt8
    var int16b0: EnumInt16
    var int16b1: EnumInt16
    var int16b2: EnumInt16
    var int16b3: EnumInt16
    var int16b4: EnumInt16
    var int16b5: EnumInt16
    var uint16b0: EnumUInt16
    var uint16b1: EnumUInt16
    var uint16b2: EnumUInt16
    var uint16b3: EnumUInt16
    var uint16b4: EnumUInt16
    var uint16b5: EnumUInt16
    var int32b0: EnumInt32
    var int32b1: EnumInt32
    var int32b2: EnumInt32
    var int32b3: EnumInt32
    var int32b4: EnumInt32
    var int32b5: EnumInt32
    var uint32b0: EnumUInt32
    var uint32b1: EnumUInt32
    var uint32b2: EnumUInt32
    var uint32b3: EnumUInt32
    var uint32b4: EnumUInt32
    var uint32b5: EnumUInt32
    var int64b0: EnumInt64
    var int64b1: EnumInt64
    var int64b2: EnumInt64
    var int64b3: EnumInt64
    var int64b4: EnumInt64
    var int64b5: EnumInt64
    var uint64b0: EnumUInt64
    var uint64b1: EnumUInt64
    var uint64b2: EnumUInt64
    var uint64b3: EnumUInt64
    var uint64b4: EnumUInt64
    var uint64b5: EnumUInt64

    @Transient open var fbeType: Long = 1

    constructor(byte0: EnumByte = EnumByte.ENUM_VALUE_0, byte1: EnumByte = EnumByte.ENUM_VALUE_1, byte2: EnumByte = EnumByte.ENUM_VALUE_2, byte3: EnumByte = EnumByte.ENUM_VALUE_3, byte4: EnumByte = EnumByte.ENUM_VALUE_4, byte5: EnumByte = EnumByte.ENUM_VALUE_5, char0: EnumChar = EnumChar.ENUM_VALUE_0, char1: EnumChar = EnumChar.ENUM_VALUE_1, char2: EnumChar = EnumChar.ENUM_VALUE_2, char3: EnumChar = EnumChar.ENUM_VALUE_3, char4: EnumChar = EnumChar.ENUM_VALUE_4, char5: EnumChar = EnumChar.ENUM_VALUE_5, wchar0: EnumWChar = EnumWChar.ENUM_VALUE_0, wchar1: EnumWChar = EnumWChar.ENUM_VALUE_1, wchar2: EnumWChar = EnumWChar.ENUM_VALUE_2, wchar3: EnumWChar = EnumWChar.ENUM_VALUE_3, wchar4: EnumWChar = EnumWChar.ENUM_VALUE_4, wchar5: EnumWChar = EnumWChar.ENUM_VALUE_5, int8b0: EnumInt8 = EnumInt8.ENUM_VALUE_0, int8b1: EnumInt8 = EnumInt8.ENUM_VALUE_1, int8b2: EnumInt8 = EnumInt8.ENUM_VALUE_2, int8b3: EnumInt8 = EnumInt8.ENUM_VALUE_3, int8b4: EnumInt8 = EnumInt8.ENUM_VALUE_4, int8b5: EnumInt8 = EnumInt8.ENUM_VALUE_5, uint8b0: EnumUInt8 = EnumUInt8.ENUM_VALUE_0, uint8b1: EnumUInt8 = EnumUInt8.ENUM_VALUE_1, uint8b2: EnumUInt8 = EnumUInt8.ENUM_VALUE_2, uint8b3: EnumUInt8 = EnumUInt8.ENUM_VALUE_3, uint8b4: EnumUInt8 = EnumUInt8.ENUM_VALUE_4, uint8b5: EnumUInt8 = EnumUInt8.ENUM_VALUE_5, int16b0: EnumInt16 = EnumInt16.ENUM_VALUE_0, int16b1: EnumInt16 = EnumInt16.ENUM_VALUE_1, int16b2: EnumInt16 = EnumInt16.ENUM_VALUE_2, int16b3: EnumInt16 = EnumInt16.ENUM_VALUE_3, int16b4: EnumInt16 = EnumInt16.ENUM_VALUE_4, int16b5: EnumInt16 = EnumInt16.ENUM_VALUE_5, uint16b0: EnumUInt16 = EnumUInt16.ENUM_VALUE_0, uint16b1: EnumUInt16 = EnumUInt16.ENUM_VALUE_1, uint16b2: EnumUInt16 = EnumUInt16.ENUM_VALUE_2, uint16b3: EnumUInt16 = EnumUInt16.ENUM_VALUE_3, uint16b4: EnumUInt16 = EnumUInt16.ENUM_VALUE_4, uint16b5: EnumUInt16 = EnumUInt16.ENUM_VALUE_5, int32b0: EnumInt32 = EnumInt32.ENUM_VALUE_0, int32b1: EnumInt32 = EnumInt32.ENUM_VALUE_1, int32b2: EnumInt32 = EnumInt32.ENUM_VALUE_2, int32b3: EnumInt32 = EnumInt32.ENUM_VALUE_3, int32b4: EnumInt32 = EnumInt32.ENUM_VALUE_4, int32b5: EnumInt32 = EnumInt32.ENUM_VALUE_5, uint32b0: EnumUInt32 = EnumUInt32.ENUM_VALUE_0, uint32b1: EnumUInt32 = EnumUInt32.ENUM_VALUE_1, uint32b2: EnumUInt32 = EnumUInt32.ENUM_VALUE_2, uint32b3: EnumUInt32 = EnumUInt32.ENUM_VALUE_3, uint32b4: EnumUInt32 = EnumUInt32.ENUM_VALUE_4, uint32b5: EnumUInt32 = EnumUInt32.ENUM_VALUE_5, int64b0: EnumInt64 = EnumInt64.ENUM_VALUE_0, int64b1: EnumInt64 = EnumInt64.ENUM_VALUE_1, int64b2: EnumInt64 = EnumInt64.ENUM_VALUE_2, int64b3: EnumInt64 = EnumInt64.ENUM_VALUE_3, int64b4: EnumInt64 = EnumInt64.ENUM_VALUE_4, int64b5: EnumInt64 = EnumInt64.ENUM_VALUE_5, uint64b0: EnumUInt64 = EnumUInt64.ENUM_VALUE_0, uint64b1: EnumUInt64 = EnumUInt64.ENUM_VALUE_1, uint64b2: EnumUInt64 = EnumUInt64.ENUM_VALUE_2, uint64b3: EnumUInt64 = EnumUInt64.ENUM_VALUE_3, uint64b4: EnumUInt64 = EnumUInt64.ENUM_VALUE_4, uint64b5: EnumUInt64 = EnumUInt64.ENUM_VALUE_5)
    {
        this.byte0 = byte0
        this.byte1 = byte1
        this.byte2 = byte2
        this.byte3 = byte3
        this.byte4 = byte4
        this.byte5 = byte5
        this.char0 = char0
        this.char1 = char1
        this.char2 = char2
        this.char3 = char3
        this.char4 = char4
        this.char5 = char5
        this.wchar0 = wchar0
        this.wchar1 = wchar1
        this.wchar2 = wchar2
        this.wchar3 = wchar3
        this.wchar4 = wchar4
        this.wchar5 = wchar5
        this.int8b0 = int8b0
        this.int8b1 = int8b1
        this.int8b2 = int8b2
        this.int8b3 = int8b3
        this.int8b4 = int8b4
        this.int8b5 = int8b5
        this.uint8b0 = uint8b0
        this.uint8b1 = uint8b1
        this.uint8b2 = uint8b2
        this.uint8b3 = uint8b3
        this.uint8b4 = uint8b4
        this.uint8b5 = uint8b5
        this.int16b0 = int16b0
        this.int16b1 = int16b1
        this.int16b2 = int16b2
        this.int16b3 = int16b3
        this.int16b4 = int16b4
        this.int16b5 = int16b5
        this.uint16b0 = uint16b0
        this.uint16b1 = uint16b1
        this.uint16b2 = uint16b2
        this.uint16b3 = uint16b3
        this.uint16b4 = uint16b4
        this.uint16b5 = uint16b5
        this.int32b0 = int32b0
        this.int32b1 = int32b1
        this.int32b2 = int32b2
        this.int32b3 = int32b3
        this.int32b4 = int32b4
        this.int32b5 = int32b5
        this.uint32b0 = uint32b0
        this.uint32b1 = uint32b1
        this.uint32b2 = uint32b2
        this.uint32b3 = uint32b3
        this.uint32b4 = uint32b4
        this.uint32b5 = uint32b5
        this.int64b0 = int64b0
        this.int64b1 = int64b1
        this.int64b2 = int64b2
        this.int64b3 = int64b3
        this.int64b4 = int64b4
        this.int64b5 = int64b5
        this.uint64b0 = uint64b0
        this.uint64b1 = uint64b1
        this.uint64b2 = uint64b2
        this.uint64b3 = uint64b3
        this.uint64b4 = uint64b4
        this.uint64b5 = uint64b5
    }

    @Suppress("UNUSED_PARAMETER")
    constructor(other: Enums)
    {
        this.byte0 = other.byte0
        this.byte1 = other.byte1
        this.byte2 = other.byte2
        this.byte3 = other.byte3
        this.byte4 = other.byte4
        this.byte5 = other.byte5
        this.char0 = other.char0
        this.char1 = other.char1
        this.char2 = other.char2
        this.char3 = other.char3
        this.char4 = other.char4
        this.char5 = other.char5
        this.wchar0 = other.wchar0
        this.wchar1 = other.wchar1
        this.wchar2 = other.wchar2
        this.wchar3 = other.wchar3
        this.wchar4 = other.wchar4
        this.wchar5 = other.wchar5
        this.int8b0 = other.int8b0
        this.int8b1 = other.int8b1
        this.int8b2 = other.int8b2
        this.int8b3 = other.int8b3
        this.int8b4 = other.int8b4
        this.int8b5 = other.int8b5
        this.uint8b0 = other.uint8b0
        this.uint8b1 = other.uint8b1
        this.uint8b2 = other.uint8b2
        this.uint8b3 = other.uint8b3
        this.uint8b4 = other.uint8b4
        this.uint8b5 = other.uint8b5
        this.int16b0 = other.int16b0
        this.int16b1 = other.int16b1
        this.int16b2 = other.int16b2
        this.int16b3 = other.int16b3
        this.int16b4 = other.int16b4
        this.int16b5 = other.int16b5
        this.uint16b0 = other.uint16b0
        this.uint16b1 = other.uint16b1
        this.uint16b2 = other.uint16b2
        this.uint16b3 = other.uint16b3
        this.uint16b4 = other.uint16b4
        this.uint16b5 = other.uint16b5
        this.int32b0 = other.int32b0
        this.int32b1 = other.int32b1
        this.int32b2 = other.int32b2
        this.int32b3 = other.int32b3
        this.int32b4 = other.int32b4
        this.int32b5 = other.int32b5
        this.uint32b0 = other.uint32b0
        this.uint32b1 = other.uint32b1
        this.uint32b2 = other.uint32b2
        this.uint32b3 = other.uint32b3
        this.uint32b4 = other.uint32b4
        this.uint32b5 = other.uint32b5
        this.int64b0 = other.int64b0
        this.int64b1 = other.int64b1
        this.int64b2 = other.int64b2
        this.int64b3 = other.int64b3
        this.int64b4 = other.int64b4
        this.int64b5 = other.int64b5
        this.uint64b0 = other.uint64b0
        this.uint64b1 = other.uint64b1
        this.uint64b2 = other.uint64b2
        this.uint64b3 = other.uint64b3
        this.uint64b4 = other.uint64b4
        this.uint64b5 = other.uint64b5
    }

    open fun clone(): Enums
    {
        // Serialize the struct to the FBE stream
        val writer = com.chronoxor.enums.fbe.EnumsModel()
        writer.serialize(this)

        // Deserialize the struct from the FBE stream
        val reader = com.chronoxor.enums.fbe.EnumsModel()
        reader.attach(writer.buffer)
        return reader.deserialize()
    }

    override fun compareTo(other: Any?): Int
    {
        if (other == null)
            return -1

        if (!Enums::class.java.isAssignableFrom(other.javaClass))
            return -1

        @Suppress("UNUSED_VARIABLE")
        val obj = other as Enums? ?: return -1

        @Suppress("VARIABLE_WITH_REDUNDANT_INITIALIZER", "CanBeVal", "UnnecessaryVariable")
        var result = 0
        return result
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!Enums::class.java.isAssignableFrom(other.javaClass))
            return false

        @Suppress("UNUSED_VARIABLE")
        val obj = other as Enums? ?: return false

        return true
    }

    override fun hashCode(): Int
    {
        @Suppress("CanBeVal", "UnnecessaryVariable")
        var hash = 17
        return hash
    }

    override fun toString(): String
    {
        val sb = StringBuilder()
        sb.append("Enums(")
        sb.append("byte0="); sb.append(byte0)
        sb.append(",byte1="); sb.append(byte1)
        sb.append(",byte2="); sb.append(byte2)
        sb.append(",byte3="); sb.append(byte3)
        sb.append(",byte4="); sb.append(byte4)
        sb.append(",byte5="); sb.append(byte5)
        sb.append(",char0="); sb.append(char0)
        sb.append(",char1="); sb.append(char1)
        sb.append(",char2="); sb.append(char2)
        sb.append(",char3="); sb.append(char3)
        sb.append(",char4="); sb.append(char4)
        sb.append(",char5="); sb.append(char5)
        sb.append(",wchar0="); sb.append(wchar0)
        sb.append(",wchar1="); sb.append(wchar1)
        sb.append(",wchar2="); sb.append(wchar2)
        sb.append(",wchar3="); sb.append(wchar3)
        sb.append(",wchar4="); sb.append(wchar4)
        sb.append(",wchar5="); sb.append(wchar5)
        sb.append(",int8b0="); sb.append(int8b0)
        sb.append(",int8b1="); sb.append(int8b1)
        sb.append(",int8b2="); sb.append(int8b2)
        sb.append(",int8b3="); sb.append(int8b3)
        sb.append(",int8b4="); sb.append(int8b4)
        sb.append(",int8b5="); sb.append(int8b5)
        sb.append(",uint8b0="); sb.append(uint8b0)
        sb.append(",uint8b1="); sb.append(uint8b1)
        sb.append(",uint8b2="); sb.append(uint8b2)
        sb.append(",uint8b3="); sb.append(uint8b3)
        sb.append(",uint8b4="); sb.append(uint8b4)
        sb.append(",uint8b5="); sb.append(uint8b5)
        sb.append(",int16b0="); sb.append(int16b0)
        sb.append(",int16b1="); sb.append(int16b1)
        sb.append(",int16b2="); sb.append(int16b2)
        sb.append(",int16b3="); sb.append(int16b3)
        sb.append(",int16b4="); sb.append(int16b4)
        sb.append(",int16b5="); sb.append(int16b5)
        sb.append(",uint16b0="); sb.append(uint16b0)
        sb.append(",uint16b1="); sb.append(uint16b1)
        sb.append(",uint16b2="); sb.append(uint16b2)
        sb.append(",uint16b3="); sb.append(uint16b3)
        sb.append(",uint16b4="); sb.append(uint16b4)
        sb.append(",uint16b5="); sb.append(uint16b5)
        sb.append(",int32b0="); sb.append(int32b0)
        sb.append(",int32b1="); sb.append(int32b1)
        sb.append(",int32b2="); sb.append(int32b2)
        sb.append(",int32b3="); sb.append(int32b3)
        sb.append(",int32b4="); sb.append(int32b4)
        sb.append(",int32b5="); sb.append(int32b5)
        sb.append(",uint32b0="); sb.append(uint32b0)
        sb.append(",uint32b1="); sb.append(uint32b1)
        sb.append(",uint32b2="); sb.append(uint32b2)
        sb.append(",uint32b3="); sb.append(uint32b3)
        sb.append(",uint32b4="); sb.append(uint32b4)
        sb.append(",uint32b5="); sb.append(uint32b5)
        sb.append(",int64b0="); sb.append(int64b0)
        sb.append(",int64b1="); sb.append(int64b1)
        sb.append(",int64b2="); sb.append(int64b2)
        sb.append(",int64b3="); sb.append(int64b3)
        sb.append(",int64b4="); sb.append(int64b4)
        sb.append(",int64b5="); sb.append(int64b5)
        sb.append(",uint64b0="); sb.append(uint64b0)
        sb.append(",uint64b1="); sb.append(uint64b1)
        sb.append(",uint64b2="); sb.append(uint64b2)
        sb.append(",uint64b3="); sb.append(uint64b3)
        sb.append(",uint64b4="); sb.append(uint64b4)
        sb.append(",uint64b5="); sb.append(uint64b5)
        sb.append(")")
        return sb.toString()
    }

    open fun toJson(): String = com.chronoxor.enums.fbe.Json.engine.toJson(this)

    companion object
    {
        const val fbeTypeConst: Long = 1
        fun fromJson(json: String): Enums = com.chronoxor.enums.fbe.Json.engine.fromJson(json, Enums::class.java)
    }
}
