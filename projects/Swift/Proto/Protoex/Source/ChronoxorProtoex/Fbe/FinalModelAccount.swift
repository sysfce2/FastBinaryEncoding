//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

import ChronoxorFbe
import ChronoxorProto

// Fast Binary Encoding Account final model
public class FinalModelAccount: FinalModel {
    public var _buffer: Buffer
    public var _offset: Int

    let id: ChronoxorFbe.FinalModelInt32
    let name: ChronoxorFbe.FinalModelString
    let state: FinalModelStateEx
    let wallet: FinalModelBalance
    let asset: FinalModelOptionalBalance
    let orders: FinalModelVectorOrder

    // Field type
    public var fbeType: Int = fbeTypeConst

    public static let fbeTypeConst: Int = 3

    public required init(buffer: Buffer, offset: Int) {
        _buffer = buffer
        _offset = offset

        id = FinalModelInt32(buffer: buffer, offset: 0)
        name = FinalModelString(buffer: buffer, offset: 0)
        state = FinalModelStateEx(buffer: buffer, offset: 0)
        wallet = FinalModelBalance(buffer: buffer, offset: 0)
        asset = FinalModelOptionalBalance(buffer: buffer, offset: 0)
        orders = FinalModelVectorOrder(buffer: buffer, offset: 0)
    }

    // Get the allocation size
    public func fbeAllocationSize(value fbeValue: Account) -> Int {
        return 0
            + id.fbeAllocationSize(value: fbeValue.id)
            + name.fbeAllocationSize(value: fbeValue.name)
            + state.fbeAllocationSize(value: fbeValue.state)
            + wallet.fbeAllocationSize(value: fbeValue.wallet)
            + asset.fbeAllocationSize(value: fbeValue.asset)
            + orders.fbeAllocationSize(value: fbeValue.orders)
    }

    // Check if the struct value is valid
    public func verify() -> Int {
        _buffer.shift(offset: fbeOffset)
        let fbeResult = verifyFields()
        _buffer.unshift(offset: fbeOffset)
        return fbeResult
    }

    // Check if the struct fields are valid
    public func verifyFields() -> Int {
        var fbeCurrentOffset: Int = 0
        var fbeFieldSize: Int = 0

        id.fbeOffset = fbeCurrentOffset
        fbeFieldSize = id.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        name.fbeOffset = fbeCurrentOffset
        fbeFieldSize = name.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        state.fbeOffset = fbeCurrentOffset
        fbeFieldSize = state.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        wallet.fbeOffset = fbeCurrentOffset
        fbeFieldSize = wallet.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        asset.fbeOffset = fbeCurrentOffset
        fbeFieldSize = asset.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        orders.fbeOffset = fbeCurrentOffset
        fbeFieldSize = orders.verify()
        if fbeFieldSize == Int.max {
            return Int.max
        }
        fbeCurrentOffset += fbeFieldSize

        return fbeCurrentOffset
    }

    // Get the struct value
    public func get(size: inout Size) -> Account {
        var fbeValue = Account()
        return get(size: &size, fbeValue: &fbeValue)
    }

    // Get the struct value
    public func get(size: inout Size, fbeValue: inout Account) -> Account {
        _buffer.shift(offset: fbeOffset)
        size.value = getFields(fbeValue: &fbeValue)
        _buffer.unshift(offset: fbeOffset)
        return fbeValue
    }

    // Get the struct fields values
    public func getFields(fbeValue: inout Account) -> Int {
        var fbeCurrentOffset: Int = 0
        var fbeCurrentSize: Int = 0
        var fbeFieldSize = Size()

        id.fbeOffset = fbeCurrentOffset
        fbeValue.id = id.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        name.fbeOffset = fbeCurrentOffset
        fbeValue.name = name.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        state.fbeOffset = fbeCurrentOffset
        fbeValue.state = state.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        wallet.fbeOffset = fbeCurrentOffset
        fbeValue.wallet = wallet.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        asset.fbeOffset = fbeCurrentOffset
        fbeValue.asset = asset.get(size: &fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        orders.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = orders.get(values: &fbeValue.orders)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }

    // Set the struct value
    public func set(value fbeValue: Account) throws -> Int {
        _buffer.shift(offset: fbeOffset)
        let fbeSize = try setFields(fbeValue: fbeValue)
        _buffer.unshift(offset: fbeOffset)
        return fbeSize
    }

    // Set the struct fields values
    public func setFields(fbeValue: Account) throws -> Int {
        var fbeCurrentOffset: Int = 0
        var fbeCurrentSize: Int = 0
        let fbeFieldSize = Size()

        id.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try id.set(value: fbeValue.id)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        name.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try name.set(value: fbeValue.name)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        state.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try state.set(value: fbeValue.state)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        wallet.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try wallet.set(value: fbeValue.wallet)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        asset.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try asset.set(value: fbeValue.asset)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        orders.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = try orders.set(value: fbeValue.orders)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }
}
