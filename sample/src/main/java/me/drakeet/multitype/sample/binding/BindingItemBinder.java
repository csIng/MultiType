package me.drakeet.multitype.sample.binding;

import me.drakeet.multitype.binding.ItemViewDataBinding;
import me.drakeet.multitype.sample.BR;
import me.drakeet.multitype.sample.R;
import me.drakeet.multitype.sample.databinding.ItemBindingBinding;

public class BindingItemBinder extends ItemViewDataBinding<BindingItem, ItemBindingBinding> {
  @Override
  public int getLayoutId() {
    return R.layout.item_binding;
  }

  @Override
  public int getVariableId() {
    return BR.item;
  }
}
