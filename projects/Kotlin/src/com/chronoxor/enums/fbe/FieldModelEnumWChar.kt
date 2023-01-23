//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.enums.fbe

// Fast Binary Encoding EnumWChar field model
class FieldModelEnumWChar(buffer: com.chronoxor.fbe.Buffer, offset: Long) : com.chronoxor.fbe.FieldModel(buffer, offset)
{
    // Field size
    override val fbeSize: Long = 4

    // Get the value
    fun get(defaults: com.chronoxor.enums.EnumWChar = com.chronoxor.enums.EnumWChar()): com.chronoxor.enums.EnumWChar
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return defaults

        return com.chronoxor.enums.EnumWChar(readInt32(fbeOffset))
    }

    // Set the value
    fun set(value: com.chronoxor.enums.EnumWChar)
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return

        write(fbeOffset, value.raw)
    }
}
