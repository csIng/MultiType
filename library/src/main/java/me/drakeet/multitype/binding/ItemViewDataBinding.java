package me.drakeet.multitype.binding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.drakeet.multitype.ItemViewBinder;

/**
 * Created by cs on 9/11/18
 */

public abstract class ItemViewDataBinding<D, VDB extends ViewDataBinding> extends ItemViewBinder<D, ViewHolderBinding<VDB>> {
  @NonNull
  @Override
  protected ViewHolderBinding<VDB> onCreateViewHolder(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
    View view = layoutInflater.inflate(getLayoutId(), viewGroup, false);
    VDB vdb = DataBindingUtil.bind(view);
    return new ViewHolderBinding<>(vdb);
  }

  @Override
  protected void onBindViewHolder(@NonNull ViewHolderBinding<VDB> holder, @NonNull D d) {
    holder.getViewDataBinding().setVariable(getVariableId(), d);
    holder.getViewDataBinding().executePendingBindings();
  }

  public abstract int getLayoutId();

  public abstract int getVariableId();
}
