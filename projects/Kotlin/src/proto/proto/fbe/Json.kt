// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.1.0.0

@file:Suppress("UnusedImport", "unused")

package proto.fbe

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*
import proto.*

import com.google.gson.*

// Fast Binary Encoding proto JSON engine
object Json
{
    // Get the JSON engine
    val engine: Gson = register(GsonBuilder()).create()

    @Suppress("MemberVisibilityCanBePrivate")
    fun register(builder: GsonBuilder): GsonBuilder
    {
        fbe.Json.register(builder)
        builder.registerTypeAdapter(OrderSide::class.java, OrderSideJson())
        builder.registerTypeAdapter(OrderType::class.java, OrderTypeJson())
        builder.registerTypeAdapter(State::class.java, StateJson())
        return builder
    }
}