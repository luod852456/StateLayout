# StateLayout

implementation 'com.github.luod852456:StateLayout:1.0.1'
  
  
继承SStateLayout自定义StateLayout的空白页面和出错页面


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


