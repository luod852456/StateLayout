# StateLayout
页面状态显示

# Gradle
[![](https://jitpack.io/v/luod852456/StateLayout.svg)](https://jitpack.io/#luod852456/StateLayout)

# XML
```xml
    <com.luodong.statelayout.view.StateLayout
        android:id="@+id/v_state_layout"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <ListView
            android:layout_width="match_parent"
            android:layout_height="match_parent" />

    </com.luodong.statelayout.view.StateLayout>
```
# 使用方法
提供三个显示页面的方法
```java
    showContent();//显示内容
    showError();//显示错误
    showEmpty();//显示空白
```
# 自定义状态页面
继承SStateLayout可实现自定义StateLayout的空白页面和出错页面
```java
    public class StateLayout extends SStateLayout<EmptyView, ErrorView> {
    
        public StateLayout(Context context) {
            super(context);
        }

        public StateLayout(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        public StateLayout(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
        }

        /**
        * 实现自定义空白页面
        *
        * @return
        */
        @Override
        protected EmptyView addEmptyView() {
            EmptyView emptyView = new EmptyView(getContext());
            return emptyView;
        }

        /**
        * 实现自定义错误页面
        *
        * @return
        */
        @Override
        protected ErrorView addErrorView() {
            ErrorView errorView = new ErrorView(getContext());
            return errorView;
        }
    }
```


