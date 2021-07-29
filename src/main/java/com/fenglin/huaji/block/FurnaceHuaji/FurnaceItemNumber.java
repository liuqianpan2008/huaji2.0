package com.fenglin.huaji.block.FurnaceHuaji;

import net.minecraft.util.IIntArray;

public class FurnaceItemNumber implements IIntArray {
    int i = 0;
    @Override
    public int get(int p_221476_1_) {
        return i;
    }

    @Override
    public void set(int p_221477_1_, int p_221477_2_) {
        i = p_221477_2_;
    }

    @Override
    public int getCount() {
        return 1;
    }
}
