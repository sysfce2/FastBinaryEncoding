//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

import ChronoxorFbe

// Fast Binary Encoding EnumInt32 final model
public class FinalModelEnumInt32: FinalModel {

    public var _buffer: Buffer
    public var _offset: Int

    // Final size
    public let fbeSize: Int = 4

    public init(buffer: Buffer = Buffer(), offset: Int = 0) {
        _buffer = buffer
        _offset = offset
    }

    // Get the allocation size
    public func fbeAllocationSize(value: EnumInt32) -> Int { fbeSize }

    public func verify() -> Int {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return Int.max
        }

        return fbeSize
    }

    // Get the value
    public func get(size: inout Size) -> EnumInt32 {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return EnumInt32()
        }

        size.value = fbeSize
        return EnumInt32(value: readInt32(offset: fbeOffset))
    }

    // Set the value
    public func set(value: EnumInt32) throws -> Int {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            assertionFailure("Model is broken!")
            return 0
        }

        write(offset: fbeOffset, value: value.raw)
        return fbeSize
    }
}
