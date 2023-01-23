//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

#if defined(_MSC_VER)
#pragma warning(push)
#pragma warning(disable:4065) // C4065: switch statement contains 'default' but no 'case' labels
#endif

#include "test_protocol.h"

namespace FBE {

namespace test {

bool Receiver::onReceive(size_t type, const void* data, size_t size)
{
    switch (type)
    {
        default: break;
    }

    if (proto::Receiver::onReceive(type, data, size))
        return true;

    return false;
}

bool Proxy::onReceive(size_t type, const void* data, size_t size)
{
    switch (type)
    {
        default: break;
    }

    if (proto::Proxy::onReceive(type, data, size))
        return true;

    return false;
}

void Client::reset_requests()
{
    proto::Client::reset_requests();
}

void Client::watchdog_requests(uint64_t utc)
{
    proto::Client::watchdog_requests(utc);

}

} // namespace test

} // namespace FBE

#if defined(_MSC_VER)
#pragma warning(pop)
#endif
