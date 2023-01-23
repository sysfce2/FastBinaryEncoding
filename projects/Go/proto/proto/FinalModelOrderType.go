//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

package proto

import "errors"
import "../fbe"

// Fast Binary Encoding OrderType final model
type FinalModelOrderType struct {
    // Final model buffer
    buffer *fbe.Buffer
    // Final model buffer offset
    offset int
}

// Create a new OrderType final model
func NewFinalModelOrderType(buffer *fbe.Buffer, offset int) *FinalModelOrderType {
    return &FinalModelOrderType{buffer: buffer, offset: offset}
}

// Get the allocation size
func (fm *FinalModelOrderType) FBEAllocationSize(value *OrderType) int { return fm.FBESize() }

// Get the final size
func (fm *FinalModelOrderType) FBESize() int { return 1 }

// Get the final offset
func (fm *FinalModelOrderType) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelOrderType) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelOrderType) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelOrderType) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FinalModelOrderType) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return fbe.MaxInt
    }

    return fm.FBESize()
}

// Get the value
func (fm *FinalModelOrderType) Get() (*OrderType, int, error) {
    var value OrderType
    size, err := fm.GetValueDefault(&value, OrderType(0))
    return &value, size, err
}

// Get the value with provided default value
func (fm *FinalModelOrderType) GetDefault(defaults OrderType) (*OrderType, int, error) {
    var value OrderType
    size, err := fm.GetValueDefault(&value, defaults)
    return &value, size, err
}

// Get the value by the given pointer
func (fm *FinalModelOrderType) GetValue(value *OrderType) (int, error) {
    return fm.GetValueDefault(value, OrderType(0))
}

// Get the value by the given pointer with provided default value
func (fm *FinalModelOrderType) GetValueDefault(value *OrderType, defaults OrderType) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        *value = defaults
        return 0, errors.New("model is broken")
    }

    *value = OrderType(fbe.ReadByte(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    return fm.FBESize(), nil
}

// Set the value by the given pointer
func (fm *FinalModelOrderType) Set(value *OrderType) (int, error) {
    return fm.SetValue(*value)
}

// Set the value
func (fm *FinalModelOrderType) SetValue(value OrderType) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    fbe.WriteByte(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), byte(value))
    return fm.FBESize(), nil
}
