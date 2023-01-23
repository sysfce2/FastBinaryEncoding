//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

package fbe

import "errors"

// Fast Binary Encoding Char final model
type FinalModelChar struct {
    // Final model buffer
    buffer *Buffer
    // Final model buffer offset
    offset int
}

// Create a new Char final model
func NewFinalModelChar(buffer *Buffer, offset int) *FinalModelChar {
    return &FinalModelChar{buffer: buffer, offset: offset}
}

// Get the allocation size
func (fm *FinalModelChar) FBEAllocationSize(value rune) int { return fm.FBESize() }

// Get the final size
func (fm *FinalModelChar) FBESize() int { return 1 }

// Get the final offset
func (fm *FinalModelChar) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelChar) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelChar) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelChar) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FinalModelChar) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return MaxInt
    }

    return fm.FBESize()
}

// Get the value
func (fm *FinalModelChar) Get() (rune, int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return '\000', 0, errors.New("model is broken")
    }

    return ReadChar(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()), fm.FBESize(), nil
}

// Set the value
func (fm *FinalModelChar) Set(value rune) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    WriteChar(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), value)
    return fm.FBESize(), nil
}
