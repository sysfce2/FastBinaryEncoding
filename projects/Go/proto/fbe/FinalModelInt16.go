//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

package fbe

import "errors"

// Fast Binary Encoding Int16 final model
type FinalModelInt16 struct {
    // Final model buffer
    buffer *Buffer
    // Final model buffer offset
    offset int
}

// Create a new Int16 final model
func NewFinalModelInt16(buffer *Buffer, offset int) *FinalModelInt16 {
    return &FinalModelInt16{buffer: buffer, offset: offset}
}

// Get the allocation size
func (fm *FinalModelInt16) FBEAllocationSize(value int16) int { return fm.FBESize() }

// Get the final size
func (fm *FinalModelInt16) FBESize() int { return 2 }

// Get the final offset
func (fm *FinalModelInt16) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelInt16) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelInt16) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelInt16) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FinalModelInt16) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return MaxInt
    }

    return fm.FBESize()
}

// Get the value
func (fm *FinalModelInt16) Get() (int16, int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, 0, errors.New("model is broken")
    }

    return ReadInt16(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()), fm.FBESize(), nil
}

// Set the value
func (fm *FinalModelInt16) Set(value int16) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    WriteInt16(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), value)
    return fm.FBESize(), nil
}
