//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

package com.chronoxor.test.fbe;;

public final class EnumEmptyJson implements com.google.gson.JsonSerializer<com.chronoxor.test.EnumEmpty>, com.google.gson.JsonDeserializer<com.chronoxor.test.EnumEmpty>
{
    @Override
    public com.google.gson.JsonElement serialize(com.chronoxor.test.EnumEmpty src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context)
    {
        return new com.google.gson.JsonPrimitive(src.getRaw());
    }

    @Override
    public com.chronoxor.test.EnumEmpty deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type type, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException
    {
        return new com.chronoxor.test.EnumEmpty(json.getAsJsonPrimitive().getAsInt());
    }
}
