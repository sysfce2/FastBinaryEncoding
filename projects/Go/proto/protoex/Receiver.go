//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

package protoex

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// Receive OrderMessage interface
type OnReceiveOrderMessage interface {
    OnReceiveOrderMessage(value *OrderMessage)
}

// Receive OrderMessage function
type OnReceiveOrderMessageFunc func(value *OrderMessage)
func (f OnReceiveOrderMessageFunc) OnReceiveOrderMessage(value *OrderMessage) {
    f(value)
}

// Receive BalanceMessage interface
type OnReceiveBalanceMessage interface {
    OnReceiveBalanceMessage(value *BalanceMessage)
}

// Receive BalanceMessage function
type OnReceiveBalanceMessageFunc func(value *BalanceMessage)
func (f OnReceiveBalanceMessageFunc) OnReceiveBalanceMessage(value *BalanceMessage) {
    f(value)
}

// Receive AccountMessage interface
type OnReceiveAccountMessage interface {
    OnReceiveAccountMessage(value *AccountMessage)
}

// Receive AccountMessage function
type OnReceiveAccountMessageFunc func(value *AccountMessage)
func (f OnReceiveAccountMessageFunc) OnReceiveAccountMessage(value *AccountMessage) {
    f(value)
}

// Fast Binary Encoding protoex receiver
type Receiver struct {
    *fbe.Receiver
    protoReceiver *proto.Receiver
    orderMessageValue *OrderMessage
    orderMessageModel *OrderMessageModel
    balanceMessageValue *BalanceMessage
    balanceMessageModel *BalanceMessageModel
    accountMessageValue *AccountMessage
    accountMessageModel *AccountMessageModel

    // Receive OrderMessage handler
    HandlerOnReceiveOrderMessage OnReceiveOrderMessage
    // Receive BalanceMessage handler
    HandlerOnReceiveBalanceMessage OnReceiveBalanceMessage
    // Receive AccountMessage handler
    HandlerOnReceiveAccountMessage OnReceiveAccountMessage
}

// Create a new protoex receiver with an empty buffer
func NewReceiver() *Receiver {
    return NewReceiverWithBuffer(fbe.NewEmptyBuffer())
}

// Create a new protoex receiver with the given buffer
func NewReceiverWithBuffer(buffer *fbe.Buffer) *Receiver {
    receiver := &Receiver{
        fbe.NewReceiver(buffer, false),
        proto.NewReceiverWithBuffer(buffer),
        NewOrderMessage(),
        NewOrderMessageModel(buffer),
        NewBalanceMessage(),
        NewBalanceMessageModel(buffer),
        NewAccountMessage(),
        NewAccountMessageModel(buffer),
        nil,
        nil,
        nil,
    }
    receiver.SetupHandlerOnReceive(receiver)
    receiver.SetupHandlerOnReceiveOrderMessageFunc(func(value *OrderMessage) {})
    receiver.SetupHandlerOnReceiveBalanceMessageFunc(func(value *BalanceMessage) {})
    receiver.SetupHandlerOnReceiveAccountMessageFunc(func(value *AccountMessage) {})
    return receiver
}

// Imported receivers

// Get the proto receiver
func (r *Receiver) ProtoReceiver() *proto.Receiver { return r.protoReceiver }
// Set the proto receiver
func (r *Receiver) SetProtoReceiver(receiver *proto.Receiver) { r.protoReceiver = receiver }

// Setup handlers
func (r *Receiver) SetupHandlers(handlers interface{}) {
    r.Receiver.SetupHandlers(handlers)
    r.protoReceiver.SetupHandlers(handlers)
    if handler, ok := handlers.(OnReceiveOrderMessage); ok {
        r.SetupHandlerOnReceiveOrderMessage(handler)
    }
    if handler, ok := handlers.(OnReceiveBalanceMessage); ok {
        r.SetupHandlerOnReceiveBalanceMessage(handler)
    }
    if handler, ok := handlers.(OnReceiveAccountMessage); ok {
        r.SetupHandlerOnReceiveAccountMessage(handler)
    }
}

// Setup receive OrderMessage handler
func (r *Receiver) SetupHandlerOnReceiveOrderMessage(handler OnReceiveOrderMessage) { r.HandlerOnReceiveOrderMessage = handler }
// Setup receive OrderMessage handler function
func (r *Receiver) SetupHandlerOnReceiveOrderMessageFunc(function func(value *OrderMessage)) { r.HandlerOnReceiveOrderMessage = OnReceiveOrderMessageFunc(function) }
// Setup receive BalanceMessage handler
func (r *Receiver) SetupHandlerOnReceiveBalanceMessage(handler OnReceiveBalanceMessage) { r.HandlerOnReceiveBalanceMessage = handler }
// Setup receive BalanceMessage handler function
func (r *Receiver) SetupHandlerOnReceiveBalanceMessageFunc(function func(value *BalanceMessage)) { r.HandlerOnReceiveBalanceMessage = OnReceiveBalanceMessageFunc(function) }
// Setup receive AccountMessage handler
func (r *Receiver) SetupHandlerOnReceiveAccountMessage(handler OnReceiveAccountMessage) { r.HandlerOnReceiveAccountMessage = handler }
// Setup receive AccountMessage handler function
func (r *Receiver) SetupHandlerOnReceiveAccountMessageFunc(function func(value *AccountMessage)) { r.HandlerOnReceiveAccountMessage = OnReceiveAccountMessageFunc(function) }

// Receive message handler
func (r *Receiver) OnReceive(fbeType int, buffer []byte) (bool, error) {
    switch fbeType {
    case r.orderMessageModel.FBEType():
        // Deserialize the value from the FBE stream
        r.orderMessageModel.Buffer().Attach(buffer)
        if !r.orderMessageModel.Verify() {
            return false, errors.New("protoex.OrderMessage validation failed")
        }
        deserialized, err := r.orderMessageModel.DeserializeValue(r.orderMessageValue)
        if deserialized <= 0 {
            return false, errors.New("protoex.OrderMessage deserialization failed")
        }
        if err != nil {
            return false, err
        }

        // Log the value
        if r.Logging() {
            message := r.orderMessageValue.String()
            r.HandlerOnReceiveLog.OnReceiveLog(message)
        }

        // Call receive handler with deserialized value
        r.HandlerOnReceiveOrderMessage.OnReceiveOrderMessage(r.orderMessageValue)
        return true, nil
    case r.balanceMessageModel.FBEType():
        // Deserialize the value from the FBE stream
        r.balanceMessageModel.Buffer().Attach(buffer)
        if !r.balanceMessageModel.Verify() {
            return false, errors.New("protoex.BalanceMessage validation failed")
        }
        deserialized, err := r.balanceMessageModel.DeserializeValue(r.balanceMessageValue)
        if deserialized <= 0 {
            return false, errors.New("protoex.BalanceMessage deserialization failed")
        }
        if err != nil {
            return false, err
        }

        // Log the value
        if r.Logging() {
            message := r.balanceMessageValue.String()
            r.HandlerOnReceiveLog.OnReceiveLog(message)
        }

        // Call receive handler with deserialized value
        r.HandlerOnReceiveBalanceMessage.OnReceiveBalanceMessage(r.balanceMessageValue)
        return true, nil
    case r.accountMessageModel.FBEType():
        // Deserialize the value from the FBE stream
        r.accountMessageModel.Buffer().Attach(buffer)
        if !r.accountMessageModel.Verify() {
            return false, errors.New("protoex.AccountMessage validation failed")
        }
        deserialized, err := r.accountMessageModel.DeserializeValue(r.accountMessageValue)
        if deserialized <= 0 {
            return false, errors.New("protoex.AccountMessage deserialization failed")
        }
        if err != nil {
            return false, err
        }

        // Log the value
        if r.Logging() {
            message := r.accountMessageValue.String()
            r.HandlerOnReceiveLog.OnReceiveLog(message)
        }

        // Call receive handler with deserialized value
        r.HandlerOnReceiveAccountMessage.OnReceiveAccountMessage(r.accountMessageValue)
        return true, nil
    default:
        _ = fbeType
        break
    }

    if r.protoReceiver != nil {
        if ok, err := r.protoReceiver.OnReceive(fbeType, buffer); ok {
            return ok, err
        }
    }

    return false, nil
}
