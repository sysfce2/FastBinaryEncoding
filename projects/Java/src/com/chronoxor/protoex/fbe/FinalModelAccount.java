//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.14.2.0
//------------------------------------------------------------------------------

package com.chronoxor.protoex.fbe;

// Fast Binary Encoding Account final model
public final class FinalModelAccount extends com.chronoxor.fbe.FinalModel
{
    public final com.chronoxor.fbe.FinalModelInt32 id;
    public final com.chronoxor.fbe.FinalModelString name;
    public final FinalModelStateEx state;
    public final FinalModelBalance wallet;
    public final FinalModelOptionalBalance asset;
    public final FinalModelVectorOrder orders;

    public FinalModelAccount(com.chronoxor.fbe.Buffer buffer, long offset)
    {
        super(buffer, offset);
        id = new com.chronoxor.fbe.FinalModelInt32(buffer, 0);
        name = new com.chronoxor.fbe.FinalModelString(buffer, 0);
        state = new FinalModelStateEx(buffer, 0);
        wallet = new FinalModelBalance(buffer, 0);
        asset = new FinalModelOptionalBalance(buffer, 0);
        orders = new FinalModelVectorOrder(buffer, 0);
    }

    // Get the allocation size
    public long fbeAllocationSize(com.chronoxor.protoex.Account fbeValue)
    {
        long fbeResult = 0
            + id.fbeAllocationSize(fbeValue.id)
            + name.fbeAllocationSize(fbeValue.name)
            + state.fbeAllocationSize(fbeValue.state)
            + wallet.fbeAllocationSize(fbeValue.wallet)
            + asset.fbeAllocationSize(fbeValue.asset)
            + orders.fbeAllocationSize(fbeValue.orders)
            ;
        return fbeResult;
    }

    // Get the final type
    public static final long fbeTypeConst = 3;
    public long fbeType() { return fbeTypeConst; }

    // Check if the struct value is valid
    @Override
    public long verify()
    {
        _buffer.shift(fbeOffset());
        long fbeResult = verifyFields();
        _buffer.unshift(fbeOffset());
        return fbeResult;
    }

    // Check if the struct fields are valid
    public long verifyFields()
    {
        long fbeCurrentOffset = 0;
        long fbeFieldSize = 0;

        id.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = id.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        name.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = name.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        state.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = state.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        wallet.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = wallet.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        asset.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = asset.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        orders.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = orders.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        return fbeCurrentOffset;
    }

    // Get the struct value
    public com.chronoxor.protoex.Account get(com.chronoxor.fbe.Size fbeSize) { return get(fbeSize, new com.chronoxor.protoex.Account()); }
    public com.chronoxor.protoex.Account get(com.chronoxor.fbe.Size fbeSize, com.chronoxor.protoex.Account fbeValue)
    {
        _buffer.shift(fbeOffset());
        fbeSize.value = getFields(fbeValue);
        _buffer.unshift(fbeOffset());
        return fbeValue;
    }

    // Get the struct fields values
    public long getFields(com.chronoxor.protoex.Account fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new com.chronoxor.fbe.Size(0);

        id.fbeOffset(fbeCurrentOffset);
        fbeValue.id = id.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        name.fbeOffset(fbeCurrentOffset);
        fbeValue.name = name.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        state.fbeOffset(fbeCurrentOffset);
        fbeValue.state = state.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        wallet.fbeOffset(fbeCurrentOffset);
        fbeValue.wallet = wallet.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        asset.fbeOffset(fbeCurrentOffset);
        fbeValue.asset = asset.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        orders.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = orders.get(fbeValue.orders);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }

    // Set the struct value
    public long set(com.chronoxor.protoex.Account fbeValue)
    {
        _buffer.shift(fbeOffset());
        long fbeSize = setFields(fbeValue);
        _buffer.unshift(fbeOffset());
        return fbeSize;
    }

    // Set the struct fields values
    public long setFields(com.chronoxor.protoex.Account fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new com.chronoxor.fbe.Size();

        id.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = id.set(fbeValue.id);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        name.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = name.set(fbeValue.name);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        state.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = state.set(fbeValue.state);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        wallet.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = wallet.set(fbeValue.wallet);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        asset.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = asset.set(fbeValue.asset);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        orders.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = orders.set(fbeValue.orders);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }
}
