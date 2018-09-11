package me.drakeet.multitype.binding;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * Created by cs on 9/11/18.
 */

public class ViewHolderBinding<VDB extends ViewDataBinding> extends RecyclerView.ViewHolder {
  public VDB vdb;
  public ViewHolderBinding(VDB vdb) {
    super(vdb.getRoot());
    this.vdb = vdb;
  }

  public VDB getViewDataBinding() {
    return vdb;
  }
}
