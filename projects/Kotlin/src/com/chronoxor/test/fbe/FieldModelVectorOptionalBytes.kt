//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test.fbe

// Fast Binary Encoding OptionalBytes vector field model
class FieldModelVectorOptionalBytes(buffer: com.chronoxor.fbe.Buffer, offset: Long) : com.chronoxor.fbe.FieldModel(buffer, offset)
{
    private val _model = FieldModelOptionalBytes(buffer, offset)

    // Field size
    override val fbeSize: Long = 4

    // Field extra size
    override val fbeExtra: Long get()
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        val fbeVectorOffset = readUInt32(fbeOffset).toLong()
        if ((fbeVectorOffset == 0L) || ((_buffer.offset + fbeVectorOffset + 4) > _buffer.size))
            return 0

        val fbeVectorSize = readUInt32(fbeVectorOffset).toLong()

        var fbeResult: Long = 4
        _model.fbeOffset = fbeVectorOffset + 4
        var i = fbeVectorSize
        while (i-- > 0)
        {
            fbeResult += _model.fbeSize + _model.fbeExtra
            _model.fbeShift(_model.fbeSize)
        }
        return fbeResult
    }

    // Get the vector offset
    val offset: Long get()
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        return readUInt32(fbeOffset).toLong()
    }

    // Get the vector size
    val size: Long get()
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        val fbeVectorOffset = readUInt32(fbeOffset).toLong()
        if ((fbeVectorOffset == 0L) || ((_buffer.offset + fbeVectorOffset + 4) > _buffer.size))
            return 0

        return readUInt32(fbeVectorOffset).toLong()
    }

    // Vector index operator
    fun getItem(index: Long): FieldModelOptionalBytes
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }

        val fbeVectorOffset = readUInt32(fbeOffset).toLong()
        assert((fbeVectorOffset > 0) && ((_buffer.offset + fbeVectorOffset + 4) <= _buffer.size)) { "Model is broken!" }

        val fbeVectorSize = readUInt32(fbeVectorOffset).toLong()
        assert(index < fbeVectorSize) { "Index is out of bounds!" }

        _model.fbeOffset = fbeVectorOffset + 4
        _model.fbeShift(index * _model.fbeSize)
        return _model
    }

    // Resize the vector and get its first model
    fun resize(size: Long): FieldModelOptionalBytes
    {
        val fbeVectorSize = size * _model.fbeSize
        val fbeVectorOffset = _buffer.allocate(4 + fbeVectorSize) - _buffer.offset
        assert((fbeVectorOffset > 0) && ((_buffer.offset + fbeVectorOffset + 4) <= _buffer.size)) { "Model is broken!" }

        write(fbeOffset, fbeVectorOffset.toUInt())
        write(fbeVectorOffset, size.toUInt())
        write(fbeVectorOffset + 4, 0.toByte(), fbeVectorSize)

        _model.fbeOffset = fbeVectorOffset + 4
        return _model
    }

    // Check if the vector is valid
    override fun verify(): Boolean
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return true

        val fbeVectorOffset = readUInt32(fbeOffset).toLong()
        if (fbeVectorOffset == 0L)
            return true

        if ((_buffer.offset + fbeVectorOffset + 4) > _buffer.size)
            return false

        val fbeVectorSize = readUInt32(fbeVectorOffset).toLong()

        _model.fbeOffset = fbeVectorOffset + 4
        var i = fbeVectorSize
        while (i-- > 0)
        {
            if (!_model.verify())
                return false
            _model.fbeShift(_model.fbeSize)
        }

        return true
    }

    // Get the vector as java.util.ArrayList
    operator fun get(values: java.util.ArrayList<ByteArray?>)
    {
        values.clear()

        val fbeVectorSize = size
        if (fbeVectorSize == 0L)
            return

        values.ensureCapacity(fbeVectorSize.toInt())

        val fbeModel = getItem(0)
        var i = fbeVectorSize
        while (i-- > 0)
        {
            val value = fbeModel.get()
            values.add(value)
            fbeModel.fbeShift(fbeModel.fbeSize)
        }
    }

    // Get the vector as java.util.LinkedList
    operator fun get(values: java.util.LinkedList<ByteArray?>)
    {
        values.clear()

        val fbeVectorSize = size
        if (fbeVectorSize == 0L)
            return

        val fbeModel = getItem(0)
        var i = fbeVectorSize
        while (i-- > 0)
        {
            val value = fbeModel.get()
            values.add(value)
            fbeModel.fbeShift(fbeModel.fbeSize)
        }
    }

    // Get the vector as java.util.HashSet
    operator fun get(values: java.util.HashSet<ByteArray?>)
    {
        values.clear()

        val fbeVectorSize = size
        if (fbeVectorSize == 0L)
            return

        val fbeModel = getItem(0)
        var i = fbeVectorSize
        while (i-- > 0)
        {
            val value = fbeModel.get()
            values.add(value)
            fbeModel.fbeShift(fbeModel.fbeSize)
        }
    }

    // Set the vector as java.util.ArrayList
    fun set(values: java.util.ArrayList<ByteArray?>)
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return

        val fbeModel = resize(values.size.toLong())
        for (value in values)
        {
            fbeModel.set(value)
            fbeModel.fbeShift(fbeModel.fbeSize)
        }
    }

    // Set the vector as java.util.LinkedList
    fun set(values: java.util.LinkedList<ByteArray?>)
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return

        val fbeModel = resize(values.size.toLong())
        for (value in values)
        {
            fbeModel.set(value)
            fbeModel.fbeShift(fbeModel.fbeSize)
        }
    }

    // Set the vector as java.util.HashSet
    fun set(values: java.util.HashSet<ByteArray?>)
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return

        val fbeModel = resize(values.size.toLong())
        for (value in values)
        {
            fbeModel.set(value)
            fbeModel.fbeShift(fbeModel.fbeSize)
        }
    }
}
