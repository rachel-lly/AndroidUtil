package com.example.androidutil.designmodel.state;

class TvController implements PowerController,TvState{

    TvState mTvState;

    public void setTvState(TvState mTvState) {
        this.mTvState = mTvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowOnState());
    }

    @Override
    public void powerOff() {
        setTvState(new PowOffState());
    }

    @Override
    public void nextChannel() {
        mTvState.nextChannel();
    }

    @Override
    public void turnOnVoice() {
        mTvState.turnOnVoice();
    }


}
