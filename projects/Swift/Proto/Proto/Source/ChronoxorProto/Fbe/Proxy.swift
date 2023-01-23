//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

import Foundation
import ChronoxorFbe

// Fast Binary Encoding Proto proxy
open class Proxy: ChronoxorFbe.ReceiverProtocol {
    // Proxy models accessors
    private let OrderMessageModel: OrderMessageModel
    private let BalanceMessageModel: BalanceMessageModel
    private let AccountMessageModel: AccountMessageModel

    public var buffer: Buffer = Buffer()
    public var final: Bool = false

    public init() {
        OrderMessageModel = ChronoxorProto.OrderMessageModel()
        BalanceMessageModel = ChronoxorProto.BalanceMessageModel()
        AccountMessageModel = ChronoxorProto.AccountMessageModel()
        build(final: false)
    }

    public init(buffer: ChronoxorFbe.Buffer) {
        OrderMessageModel = ChronoxorProto.OrderMessageModel()
        BalanceMessageModel = ChronoxorProto.BalanceMessageModel()
        AccountMessageModel = ChronoxorProto.AccountMessageModel()
        build(with: buffer, final: false)
    }

    open func onReceive(type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        guard let listener = self as? ProxyListener else { return false }
        return onReceiveListener(listener: listener, type: type, buffer: buffer, offset: offset, size: size)
    }

    open func onReceiveListener(listener: ProxyListener, type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        switch type {
        case ChronoxorProto.OrderMessageModel.fbeTypeConst:
            // Attach the FBE stream to the proxy model
            OrderMessageModel.attach(buffer: buffer, offset: offset)
            assert(OrderMessageModel.verify(), "Proto.OrderMessage validation failed!")

            let fbeBegin = OrderMessageModel.model.getBegin()
            if fbeBegin == 0 {
                return false
            }
            // Call proxy handler
            listener.onProxy(model: OrderMessageModel, type: type, buffer: buffer, offset: offset, size: size)
            OrderMessageModel.model.getEnd(fbeBegin: fbeBegin)
            return true
        case ChronoxorProto.BalanceMessageModel.fbeTypeConst:
            // Attach the FBE stream to the proxy model
            BalanceMessageModel.attach(buffer: buffer, offset: offset)
            assert(BalanceMessageModel.verify(), "Proto.BalanceMessage validation failed!")

            let fbeBegin = BalanceMessageModel.model.getBegin()
            if fbeBegin == 0 {
                return false
            }
            // Call proxy handler
            listener.onProxy(model: BalanceMessageModel, type: type, buffer: buffer, offset: offset, size: size)
            BalanceMessageModel.model.getEnd(fbeBegin: fbeBegin)
            return true
        case ChronoxorProto.AccountMessageModel.fbeTypeConst:
            // Attach the FBE stream to the proxy model
            AccountMessageModel.attach(buffer: buffer, offset: offset)
            assert(AccountMessageModel.verify(), "Proto.AccountMessage validation failed!")

            let fbeBegin = AccountMessageModel.model.getBegin()
            if fbeBegin == 0 {
                return false
            }
            // Call proxy handler
            listener.onProxy(model: AccountMessageModel, type: type, buffer: buffer, offset: offset, size: size)
            AccountMessageModel.model.getEnd(fbeBegin: fbeBegin)
            return true
        default: break
        }

        return false
    }
}
