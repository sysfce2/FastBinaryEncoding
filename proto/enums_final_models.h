//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

#pragma once

#if defined(__clang__)
#pragma clang system_header
#elif defined(__GNUC__)
#pragma GCC system_header
#elif defined(_MSC_VER)
#pragma system_header
#endif

#include "fbe_final_models.h"

#include "enums.h"

namespace FBE {

// Fast Binary Encoding ::enums::EnumByte final model
template <>
class FinalModel<::enums::EnumByte> : public FinalModelBase<::enums::EnumByte, uint8_t>
{
public:
    using FinalModelBase<::enums::EnumByte, uint8_t>::FinalModelBase;
};

// Fast Binary Encoding ::enums::EnumChar final model
template <>
class FinalModel<::enums::EnumChar> : public FinalModelBase<::enums::EnumChar, uint8_t>
{
public:
    using FinalModelBase<::enums::EnumChar, uint8_t>::FinalModelBase;
};

// Fast Binary Encoding ::enums::EnumWChar final model
template <>
class FinalModel<::enums::EnumWChar> : public FinalModelBase<::enums::EnumWChar, uint32_t>
{
public:
    using FinalModelBase<::enums::EnumWChar, uint32_t>::FinalModelBase;
};

// Fast Binary Encoding ::enums::EnumInt8 final model
template <>
class FinalModel<::enums::EnumInt8> : public FinalModelBase<::enums::EnumInt8, int8_t>
{
public:
    using FinalModelBase<::enums::EnumInt8, int8_t>::FinalModelBase;
};

// Fast Binary Encoding ::enums::EnumUInt8 final model
template <>
class FinalModel<::enums::EnumUInt8> : public FinalModelBase<::enums::EnumUInt8, uint8_t>
{
public:
    using FinalModelBase<::enums::EnumUInt8, uint8_t>::FinalModelBase;
};

// Fast Binary Encoding ::enums::EnumInt16 final model
template <>
class FinalModel<::enums::EnumInt16> : public FinalModelBase<::enums::EnumInt16, int16_t>
{
public:
    using FinalModelBase<::enums::EnumInt16, int16_t>::FinalModelBase;
};

// Fast Binary Encoding ::enums::EnumUInt16 final model
template <>
class FinalModel<::enums::EnumUInt16> : public FinalModelBase<::enums::EnumUInt16, uint16_t>
{
public:
    using FinalModelBase<::enums::EnumUInt16, uint16_t>::FinalModelBase;
};

// Fast Binary Encoding ::enums::EnumInt32 final model
template <>
class FinalModel<::enums::EnumInt32> : public FinalModelBase<::enums::EnumInt32, int32_t>
{
public:
    using FinalModelBase<::enums::EnumInt32, int32_t>::FinalModelBase;
};

// Fast Binary Encoding ::enums::EnumUInt32 final model
template <>
class FinalModel<::enums::EnumUInt32> : public FinalModelBase<::enums::EnumUInt32, uint32_t>
{
public:
    using FinalModelBase<::enums::EnumUInt32, uint32_t>::FinalModelBase;
};

// Fast Binary Encoding ::enums::EnumInt64 final model
template <>
class FinalModel<::enums::EnumInt64> : public FinalModelBase<::enums::EnumInt64, int64_t>
{
public:
    using FinalModelBase<::enums::EnumInt64, int64_t>::FinalModelBase;
};

// Fast Binary Encoding ::enums::EnumUInt64 final model
template <>
class FinalModel<::enums::EnumUInt64> : public FinalModelBase<::enums::EnumUInt64, uint64_t>
{
public:
    using FinalModelBase<::enums::EnumUInt64, uint64_t>::FinalModelBase;
};

// Fast Binary Encoding ::enums::Enums final model
template <>
class FinalModel<::enums::Enums>
{
public:
    FinalModel(FBEBuffer& buffer, size_t offset) noexcept;

    // Get the allocation size
    size_t fbe_allocation_size(const ::enums::Enums& fbe_value) const noexcept;
    // Get the final offset
    size_t fbe_offset() const noexcept { return _offset; }
    // Set the final offset
    size_t fbe_offset(size_t offset) const noexcept { return _offset = offset; }
    // Get the final type
    static constexpr size_t fbe_type() noexcept { return 1; }

    // Shift the current final offset
    void fbe_shift(size_t size) noexcept { _offset += size; }
    // Unshift the current final offset
    void fbe_unshift(size_t size) noexcept { _offset -= size; }

    // Check if the struct value is valid
    size_t verify() const noexcept;
    // Check if the struct fields are valid
    size_t verify_fields() const noexcept;

    // Get the struct value
    size_t get(::enums::Enums& fbe_value) const noexcept;
    // Get the struct fields values
    size_t get_fields(::enums::Enums& fbe_value) const noexcept;

    // Set the struct value
    size_t set(const ::enums::Enums& fbe_value) noexcept;
    // Set the struct fields values
    size_t set_fields(const ::enums::Enums& fbe_value) noexcept;

private:
    FBEBuffer& _buffer;
    mutable size_t _offset;

public:
    FinalModel<::enums::EnumByte> byte0;
    FinalModel<::enums::EnumByte> byte1;
    FinalModel<::enums::EnumByte> byte2;
    FinalModel<::enums::EnumByte> byte3;
    FinalModel<::enums::EnumByte> byte4;
    FinalModel<::enums::EnumByte> byte5;
    FinalModel<::enums::EnumChar> char0;
    FinalModel<::enums::EnumChar> char1;
    FinalModel<::enums::EnumChar> char2;
    FinalModel<::enums::EnumChar> char3;
    FinalModel<::enums::EnumChar> char4;
    FinalModel<::enums::EnumChar> char5;
    FinalModel<::enums::EnumWChar> wchar0;
    FinalModel<::enums::EnumWChar> wchar1;
    FinalModel<::enums::EnumWChar> wchar2;
    FinalModel<::enums::EnumWChar> wchar3;
    FinalModel<::enums::EnumWChar> wchar4;
    FinalModel<::enums::EnumWChar> wchar5;
    FinalModel<::enums::EnumInt8> int8b0;
    FinalModel<::enums::EnumInt8> int8b1;
    FinalModel<::enums::EnumInt8> int8b2;
    FinalModel<::enums::EnumInt8> int8b3;
    FinalModel<::enums::EnumInt8> int8b4;
    FinalModel<::enums::EnumInt8> int8b5;
    FinalModel<::enums::EnumUInt8> uint8b0;
    FinalModel<::enums::EnumUInt8> uint8b1;
    FinalModel<::enums::EnumUInt8> uint8b2;
    FinalModel<::enums::EnumUInt8> uint8b3;
    FinalModel<::enums::EnumUInt8> uint8b4;
    FinalModel<::enums::EnumUInt8> uint8b5;
    FinalModel<::enums::EnumInt16> int16b0;
    FinalModel<::enums::EnumInt16> int16b1;
    FinalModel<::enums::EnumInt16> int16b2;
    FinalModel<::enums::EnumInt16> int16b3;
    FinalModel<::enums::EnumInt16> int16b4;
    FinalModel<::enums::EnumInt16> int16b5;
    FinalModel<::enums::EnumUInt16> uint16b0;
    FinalModel<::enums::EnumUInt16> uint16b1;
    FinalModel<::enums::EnumUInt16> uint16b2;
    FinalModel<::enums::EnumUInt16> uint16b3;
    FinalModel<::enums::EnumUInt16> uint16b4;
    FinalModel<::enums::EnumUInt16> uint16b5;
    FinalModel<::enums::EnumInt32> int32b0;
    FinalModel<::enums::EnumInt32> int32b1;
    FinalModel<::enums::EnumInt32> int32b2;
    FinalModel<::enums::EnumInt32> int32b3;
    FinalModel<::enums::EnumInt32> int32b4;
    FinalModel<::enums::EnumInt32> int32b5;
    FinalModel<::enums::EnumUInt32> uint32b0;
    FinalModel<::enums::EnumUInt32> uint32b1;
    FinalModel<::enums::EnumUInt32> uint32b2;
    FinalModel<::enums::EnumUInt32> uint32b3;
    FinalModel<::enums::EnumUInt32> uint32b4;
    FinalModel<::enums::EnumUInt32> uint32b5;
    FinalModel<::enums::EnumInt64> int64b0;
    FinalModel<::enums::EnumInt64> int64b1;
    FinalModel<::enums::EnumInt64> int64b2;
    FinalModel<::enums::EnumInt64> int64b3;
    FinalModel<::enums::EnumInt64> int64b4;
    FinalModel<::enums::EnumInt64> int64b5;
    FinalModel<::enums::EnumUInt64> uint64b0;
    FinalModel<::enums::EnumUInt64> uint64b1;
    FinalModel<::enums::EnumUInt64> uint64b2;
    FinalModel<::enums::EnumUInt64> uint64b3;
    FinalModel<::enums::EnumUInt64> uint64b4;
    FinalModel<::enums::EnumUInt64> uint64b5;
};

namespace enums {

// Fast Binary Encoding Enums final model
class EnumsFinalModel : public FBE::Model
{
public:
    EnumsFinalModel() : _model(this->buffer(), 8) {}
    EnumsFinalModel(const std::shared_ptr<FBEBuffer>& buffer) : FBE::Model(buffer), _model(this->buffer(), 8) {}

    // Get the model type
    static constexpr size_t fbe_type() noexcept { return FinalModel<::enums::Enums>::fbe_type(); }

    // Check if the struct value is valid
    bool verify();

    // Serialize the struct value
    size_t serialize(const ::enums::Enums& value);
    // Deserialize the struct value
    size_t deserialize(::enums::Enums& value) const noexcept;

    // Move to the next struct value
    void next(size_t prev) noexcept { _model.fbe_shift(prev); }

private:
    FinalModel<::enums::Enums> _model;
};

} // namespace enums

} // namespace FBE
