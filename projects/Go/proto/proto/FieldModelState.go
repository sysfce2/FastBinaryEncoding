//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

package proto

import "errors"
import "../fbe"

// Fast Binary Encoding State field model
type FieldModelState struct {
    // Field model buffer
    buffer *fbe.Buffer
    // Field model buffer offset
    offset int
}

// Create a new State field model
func NewFieldModelState(buffer *fbe.Buffer, offset int) *FieldModelState {
    return &FieldModelState{buffer: buffer, offset: offset}
}

// Get the field size
func (fm *FieldModelState) FBESize() int { return 1 }
// Get the field extra size
func (fm *FieldModelState) FBEExtra() int { return 0 }

// Get the field offset
func (fm *FieldModelState) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelState) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelState) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelState) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FieldModelState) Verify() bool { return true }

// Get the value
func (fm *FieldModelState) Get() (*State, error) {
    var value State
    return &value, fm.GetValueDefault(&value, State(0))
}

// Get the value with provided default value
func (fm *FieldModelState) GetDefault(defaults State) (*State, error) {
    var value State
    err := fm.GetValueDefault(&value, defaults)
    return &value, err
}

// Get the value by the given pointer
func (fm *FieldModelState) GetValue(value *State) error {
    return fm.GetValueDefault(value, State(0))
}

// Get the value by the given pointer with provided default value
func (fm *FieldModelState) GetValueDefault(value *State, defaults State) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        *value = defaults
        return nil
    }

    *value = State(fbe.ReadByte(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    return nil
}

// Set the value by the given pointer
func (fm *FieldModelState) Set(value *State) error {
    return fm.SetValue(*value)
}

// Set the value
func (fm *FieldModelState) SetValue(value State) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return errors.New("model is broken")
    }

    fbe.WriteByte(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), byte(value))
    return nil
}
