// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.3.0.0

#include "enums_protocol.h"

#if defined(_MSC_VER)
#pragma warning(push)
#pragma warning(disable:4065) // C4065: switch statement contains 'default' but no 'case' labels
#pragma warning(disable:4702) // C4702: unreachable code
#endif

namespace FBE {

namespace enums {

bool Receiver::onReceive(size_t type, const void* data, size_t size)
{
    switch (type)
    {
        default: break;
    }

    return false;
}

bool Proxy::onReceive(size_t type, const void* data, size_t size)
{
    switch (type)
    {
        default: break;
    }

    return false;
}

void Client::reset_requests()
{
    Sender::reset();
    Receiver::reset();
}

void Client::watchdog_requests(uint64_t utc)
{
}

} // namespace enums

} // namespace FBE

#if defined(_MSC_VER)
#pragma warning(pop)
#endif