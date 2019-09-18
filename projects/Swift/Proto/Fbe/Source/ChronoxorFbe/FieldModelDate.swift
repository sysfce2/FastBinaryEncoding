// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: Fbe
// Version: 1.3.0.0

import Foundation

// Fast Binary Encoding date field model
public class FieldModelDate: FieldModel {
    public var _buffer = Buffer()
    public var _offset: Int = 0

    // Field size
    public let fbeSize: Int = 8

    public required init() {
        _buffer = Buffer()
        _offset = 0
    }

    // Get the value
    public func get(defaults: Date = Date(timeIntervalSince1970: 0)) -> Date {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            return defaults
        }

        let nanoseconds = readInt64(offset: fbeOffset)
        return Date(timeIntervalSince1970: TimeInterval(nanoseconds / 1000000))
    }

    // Set the value
    public func set(value: Date) throws {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            assertionFailure("Model is broken!")
            return
        }

        let nanoseconds = value.timeIntervalSince1970 * 1000000
        write(offset: fbeOffset, value: UInt64(nanoseconds))
    }
}