# StateLayout

implementation 'com.github.luod852456:StateLayout:1.0.1'
    
    <com.luodong.statelayout.view.StateLayout
        android:id="@+id/v_state_layout"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <ListView
            android:layout_width="match_parent"
            android:layout_height="match_parent" />

    </com.luodong.statelayout.view.StateLayout>
  


继承SStateLayout可实现自定义StateLayout的空白页面和出错页面
    
    
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


