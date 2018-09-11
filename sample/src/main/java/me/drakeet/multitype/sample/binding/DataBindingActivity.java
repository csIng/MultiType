package me.drakeet.multitype.sample.binding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import me.drakeet.multitype.MultiTypeAdapter;
import me.drakeet.multitype.sample.MenuBaseActivity;
import me.drakeet.multitype.sample.R;
import me.drakeet.multitype.sample.databinding.ActivityDataBindingBinding;

public class DataBindingActivity extends MenuBaseActivity {

  private ActivityDataBindingBinding binding;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);
    binding.recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
    binding.recyclerView.setAdapter(createAdapter());
  }

  private RecyclerView.Adapter createAdapter() {
    MultiTypeAdapter adapter = new MultiTypeAdapter(getMockData());
    adapter.register(BindingItem.class, new BindingItemBinder());
    return adapter;
  }

  private List<Object> getMockData() {
    List<Object> result = new ArrayList<>();
    for (int i = 0; i < 50; i++) {
      result.add(BindingItem.newBuilder().withTitle("title " + i).withDesc("desc " + i).build());
    }
    return result;
  }
}
