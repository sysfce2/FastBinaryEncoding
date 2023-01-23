//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

import Foundation

public struct EnumSimple: Comparable, Hashable, Codable {
    typealias RawValue = Int32
    public static let ENUM_VALUE_0 = EnumSimple(value: EnumSimpleEnum.ENUM_VALUE_0)
    public static let ENUM_VALUE_1 = EnumSimple(value: EnumSimpleEnum.ENUM_VALUE_1)
    public static let ENUM_VALUE_2 = EnumSimple(value: EnumSimpleEnum.ENUM_VALUE_2)
    public static let ENUM_VALUE_3 = EnumSimple(value: EnumSimpleEnum.ENUM_VALUE_3)
    public static let ENUM_VALUE_4 = EnumSimple(value: EnumSimpleEnum.ENUM_VALUE_4)
    public static let ENUM_VALUE_5 = EnumSimple(value: EnumSimpleEnum.ENUM_VALUE_5)

    var value: EnumSimpleEnum?

    public var raw: Int32 { return value!.rawValue }

    public init() { setDefault() }
    public init(value: Int32) { setEnum(value: value) }
    public init(value: EnumSimpleEnum) { setEnum(value: value) }
    public init(value: EnumSimple) { setEnum(value: value) }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        setEnum(value: try container.decode(RawValue.self))
    }
    public mutating func setDefault() { setEnum(value: NSNumber(value: 0).int32Value) }

    public mutating func setEnum(value: Int32) { self.value = EnumSimpleEnum.mapValue(value: value) }
    public mutating func setEnum(value: EnumSimpleEnum) { self.value = value }
    public mutating func setEnum(value: EnumSimple) { self.value = value.value }

    public static func < (lhs: EnumSimple, rhs: EnumSimple) -> Bool {
        guard let lhsValue = lhs.value, let rhsValue = rhs.value else {
            return false
            }
        return lhsValue.rawValue < rhsValue.rawValue
    }

    public static func == (lhs: EnumSimple, rhs: EnumSimple) -> Bool {
        guard let lhsValue = lhs.value, let rhsValue = rhs.value else {
            return false
            }
        return lhsValue.rawValue == rhsValue.rawValue
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(value?.rawValue ?? 0)
    }

    public var description: String {
        return value?.description ?? "<unknown>"
    }
    public func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        try container.encode(raw)
    }

    public func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    public static func fromJson(_ json: String) throws -> EnumSimple {
        return try JSONDecoder().decode(EnumSimple.self, from: json.data(using: .utf8)!)
    }
}
