//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

import Foundation

public struct FlagsEmptyEnum: OptionSet {

    public var rawValue: Int32

    public init(rawValue: Int32) { self.rawValue = rawValue }
    public init(value: Int8) { self.rawValue = NSNumber(value: value).int32Value }
    public init(value: Int16) { self.rawValue = NSNumber(value: value).int32Value }
    public init(value: Int32) { self.rawValue = NSNumber(value: value).int32Value }
    public init(value: Int64) { self.rawValue = NSNumber(value: value).int32Value }
    public init(value: FlagsEmptyEnum) { self.rawValue = value.rawValue }

    public func hasFlags(flags: Int32) -> Bool { return ((NSNumber(value: rawValue).intValue & NSNumber(value: flags).intValue) != 0) && (NSNumber(value: rawValue).intValue & NSNumber(value: flags).intValue == NSNumber(value: flags).intValue) }
    public func hasFlags(flags: FlagsEmptyEnum) -> Bool { return hasFlags(flags: flags.rawValue) }

    public static let allSet: FlagsEmptyEnum = [
    ]
    public static let noneSet: FlagsEmptyEnum = []
    public var currentSet: FlagsEmptyEnum {
        var result = FlagsEmptyEnum.noneSet
        return result
    }

    public var description: String {
        var sb = String()
        return sb
    }

    static let rawValuesMap: [RawValue: FlagsEmptyEnum] = {
        var value = [RawValue: FlagsEmptyEnum]()
        return value
    }()

    public static func mapValue(value: RawValue) -> FlagsEmptyEnum? {
        return rawValuesMap[value]
    }
}
