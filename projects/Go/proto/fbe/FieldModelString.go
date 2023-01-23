//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

package fbe

import "errors"

// Fast Binary Encoding string field model
type FieldModelString struct {
    // Field model buffer
    buffer *Buffer
    // Field model buffer offset
    offset int
}

// Create a new string field model
func NewFieldModelString(buffer *Buffer, offset int) *FieldModelString {
    return &FieldModelString{buffer: buffer, offset: offset}
}

// Get the field size
func (fm *FieldModelString) FBESize() int { return 4 }
// Get the field extra size
func (fm *FieldModelString) FBEExtra() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0
    }

    fbeStringOffset := int(ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeStringOffset == 0) || ((fm.buffer.Offset() + fbeStringOffset + 4) > fm.buffer.Size()) {
        return 0
    }

    fbeStringSize := int(ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStringOffset))
    return 4 + fbeStringSize
}

// Get the field offset
func (fm *FieldModelString) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelString) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelString) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelString) FBEUnshift(size int) { fm.offset -= size }

// Check if the string value is valid
func (fm *FieldModelString) Verify() bool {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return true
    }

    fbeStringOffset := int(ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if fbeStringOffset == 0 {
        return true
    }

    if (fm.buffer.Offset() + fbeStringOffset + 4) > fm.buffer.Size() {
        return false
    }

    fbeStringSize := int(ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStringOffset))
    if (fm.buffer.Offset() + fbeStringOffset + 4 + fbeStringSize) > fm.buffer.Size() {
        return false
    }

    return true
}

// Get the string value
func (fm *FieldModelString) Get() (string, error) {
    return fm.GetDefault("")
}

// Get the string value with provided default value
func (fm *FieldModelString) GetDefault(defaults string) (string, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return defaults, nil
    }

    fbeStringOffset := int(ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if fbeStringOffset == 0 {
        return defaults, nil
    }

    if (fm.buffer.Offset() + fbeStringOffset + 4) > fm.buffer.Size() {
        return defaults, errors.New("model is broken")
    }

    fbeStringSize := int(ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStringOffset))
    if (fm.buffer.Offset() + fbeStringOffset + 4 + fbeStringSize) > fm.buffer.Size() {
        return defaults, errors.New("model is broken")
    }

    data := ReadBytes(fm.buffer.Data(), fm.buffer.Offset() + fbeStringOffset + 4, fbeStringSize)
    return string(data), nil
}

// Set the string value
func (fm *FieldModelString) Set(value string) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return errors.New("model is broken")
    }

    data := []byte(value)

    fbeStringSize := len(data)
    fbeStringOffset := fm.buffer.Allocate(4 + fbeStringSize) - fm.buffer.Offset()
    if (fbeStringOffset <= 0) || ((fm.buffer.Offset() + fbeStringOffset + 4 + fbeStringSize) > fm.buffer.Size()) {
        return errors.New("model is broken")
    }

    WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), uint32(fbeStringOffset))
    WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStringOffset, uint32(fbeStringSize))
    WriteBytes(fm.buffer.Data(), fm.buffer.Offset() + fbeStringOffset + 4, data)
    return nil
}
