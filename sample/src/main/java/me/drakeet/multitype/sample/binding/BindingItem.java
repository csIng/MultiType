package me.drakeet.multitype.sample.binding;

public class BindingItem {
  private String title;
  private String desc;

  private BindingItem(Builder builder) {
    setTitle(builder.title);
    setDesc(builder.desc);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }


  public static final class Builder {
    private String title;
    private String desc;

    private Builder() {
    }

    public Builder withTitle(String title) {
      this.title = title;
      return this;
    }

    public Builder withDesc(String desc) {
      this.desc = desc;
      return this;
    }

    public BindingItem build() {
      return new BindingItem(this);
    }
  }
}
