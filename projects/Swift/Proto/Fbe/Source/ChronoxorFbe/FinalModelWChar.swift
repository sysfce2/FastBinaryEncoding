//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

import Foundation

// Fast Binary Encoding Character final model
public class FinalModelWChar: FinalModel {
    public var _buffer = Buffer()
    public var _offset: Int = 0

    public init(buffer: Buffer, offset: Int) {
        _buffer = buffer
        _offset = offset
    }

    // Get the allocation size
    public func fbeAllocationSize(value: Character) -> Int {
        return fbeSize
    }

    // Field size
    public let fbeSize: Int = 4

    // Check if the value is valid
    public func verify() -> Int {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return Int.max
        }

        return fbeSize
    }

    // Get the value
    public func get(size: inout Size) -> Character {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            return Character("0")
        }

        size.value = fbeSize
        return readWChar(offset: fbeOffset)
    }

    // Set the value
    public func set(value: Character) throws -> Int {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            assertionFailure("Model is broken!")
            return 0
        }

        write(offset: fbeOffset, value: value.utf16.map { UInt32($0) }[0])
        return fbeSize
    }
}
