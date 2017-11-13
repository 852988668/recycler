package com.hzt.recycler;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String json = "{\"nowPage\":1,\"sort\":0,\"order\":null,\"sortType\":\"\\u964d\\u5e8f\",\"pageInfo\":{\"firstRow\":0,\"listRows\":20,\"totalRows\":\"72\",\"nowPage\":1,\"totalPages\":4},\"rs\":{\"list\":[{\"id\":\"19\",\"product_name\":\"CATTAN\",\"product_no\":\"TE17576\",\"sale_price\":\"106.00000000\",\"sale_money\":\"0.000000000000000000000000\",\"sale_storeage\":\"9444.00000000\",\"dml_sale_price\":\"106.000\",\"edml_sale_price\":\"106.000\",\"dml_sale_money\":\"0.000\",\"edml_sale_money\":\"0.000\",\"is_new\":0,\"is_collect\":1,\"is_promotion\":0,\"pics_path\":\"\\/Runtime\\/Uploads\\/erp2200003\\/Product\\/\",\"pics\":[]},{\"id\":\"28\",\"product_name\":\"CAPPOTTI E PARKA\",\"product_no\":\"TET17005\",\"sale_price\":\"47.70000000\",\"sale_money\":\"0.000000000000000000000000\",\"sale_storeage\":\"7025.00000000\",\"dml_sale_price\":\"47.700\",\"edml_sale_price\":\"47.700\",\"dml_sale_money\":\"0.000\",\"edml_sale_money\":\"0.000\",\"is_new\":0,\"is_collect\":1,\"is_promotion\":0,\"pics_path\":\"\\/Runtime\\/Uploads\\/erp2200003\\/Product\\/\",\"pics\":[]},{\"id\":\"8\",\"product_name\":\"CATICIA\",\"product_no\":\"ITC2710\",\"sale_price\":\"7.80000000\",\"sale_money\":\"0.000000000000000000000000\",\"sale_storeage\":\"6912.00000000\",\"dml_sale_price\":\"7.800\",\"edml_sale_price\":\"7.800\",\"dml_sale_money\":\"0.000\",\"edml_sale_money\":\"0.000\",\"is_new\":0,\"is_collect\":1,\"is_promotion\":0,\"pics_path\":\"\\/Runtime\\/Uploads\\/erp2200003\\/Product\\/\",\"pics\":[]},{\"id\":\"84\",\"product_name\":\"CAPPOTTI E PARKA\",\"product_no\":\"TET Z051\",\"sale_price\":\"44.70000000\",\"sale_money\":\"0.000000000000000000000000\",\"sale_storeage\":\"6304.00000000\",\"dml_sale_price\":\"44.700\",\"edml_sale_price\":\"44.700\",\"dml_sale_money\":\"0.000\",\"edml_sale_money\":\"0.000\",\"is_new\":0,\"is_collect\":0,\"is_promotion\":0,\"pics_path\":\"\\/Runtime\\/Uploads\\/erp2200003\\/Product\\/\",\"pics\":[]},{\"id\":\"85\",\"product_name\":\"CAPPOTTI E PARKA\",\"product_no\":\"TET Z050\",\"sale_price\":\"44.70000000\",\"sale_money\":\"0.000000000000000000000000\",\"sale_storeage\":\"6304.00000000\",\"dml_sale_price\":\"44.700\",\"edml_sale_price\":\"44.700\",\"dml_sale_money\":\"0.000\",\"edml_sale_money\":\"0.000\",\"is_new\":0,\"is_collect\":1,\"is_promotion\":0,\"pics_path\":\"\\/Runtime\\/Uploads\\/erp2200003\\/Product\\/\",\"pics\":[]},{\"id\":\"411\",\"product_name\":\"BRACCIALETTI\",\"product_no\":\"TE8762\",\"sale_price\":\"44.70000000\",\"sale_money\":\"0.000000000000000000000000\",\"sale_storeage\":\"6304.00000000\",\"dml_sale_price\":\"44.700\",\"edml_sale_price\":\"44.700\",\"dml_sale_money\":\"0.000\",\"edml_sale_money\":\"0.000\",\"is_new\":0,\"is_collect\":1,\"is_promotion\":0,\"pics_path\":\"\\/Runtime\\/Uploads\\/erp2200003\\/Product\\/\",\"pics\":[]},{\"id\":\"413\",\"product_name\":\"BRACCIALETTI\",\"product_no\":\"TE8887\",\"sale_price\":\"44.70000000\",\"sale_money\":\"0.000000000000000000000000\",\"sale_storeage\":\"6304.00000000\",\"dml_sale_price\":\"44.700\",\"edml_sale_price\":\"44.700\",\"dml_sale_money\":\"0.000\",\"edml_sale_money\":\"0.000\",\"is_new\":0,\"is_collect\":0,\"is_promotion\":0,\"pics_path\":\"\\/Runtime\\/Uploads\\/erp2200003\\/Product\\/\",\"pics\":[]},{\"id\":\"5\",\"product_name\":\"JIN 'BERMUDA\",\"product_no\":\"JINBO SHORT020\",\"sale_price\":\"12.89000000\",\"sale_money\":\"0.000000000000000000000000\",\"sale_storeage\":\"6274.00000000\",\"dml_sale_price\":\"12.890\",\"edml_sale_price\":\"12.890\",\"dml_sale_money\":\"0.000\",\"edml_sale_money\":\"0.000\",\"is_new\":0,\"is_collect\":1,\"is_promotion\":0,\"pics_path\":\"\\/Runtime\\/Uploads\\/erp2200003\\/Product\\/\",\"pics\":[{\"id\":\"8\",\"file_url\":\"zMUv68pDSfiW0sd.jpg\",\"relation_id\":\"5\",\"relation_type\":\"1\",\"cpation_name\":\"QQ\\u56fe\\u724720140513094325.jpg\",\"tocken\":\"0422f6978bc849bacbb8173763f8781e\",\"upload_date\":\"2017-07-14 18:06:52\"}]},{\"id\":\"435\",\"product_name\":\"GIUBBOTTI\",\"product_no\":\"GIUBBOTTI-841\",\"sale_price\":\"13.65000000\",\"sale_money\":\"0.000000000000000000000000\",\"sale_storeage\":\"5448.00000000\",\"dml_sale_price\":\"13.650\",\"edml_sale_price\":\"13.650\",\"dml_sale_money\":\"0.000\",\"edml_sale_money\":\"0.000\",\"is_new\":0,\"is_collect\":0,\"is_promotion\":0,\"pics_path\":\"\\/Runtime\\/Uploads\\/erp2200003\\/Product\\/\",\"pics\":[]},{\"id\":\"6\",\"product_name\":\"\\u886c\\u886b\",\"product_no\":\"JIN71401\",\"sale_price\":\"13.00000000\",\"sale_money\":\"0.000000000000000000000000\",\"sale_storeage\":\"5120.00000000\",\"dml_sale_price\":\"13.000\",\"edml_sale_price\":\"13.000\",\"dml_sale_money\":\"0.000\",\"edml_sale_money\":\"0.000\",\"is_new\":0,\"is_collect\":0,\"is_promotion\":0,\"pics_path\":\"\\/Runtime\\/Uploads\\/erp2200003\\/Product\\/\",\"pics\":[{\"id\":\"7\",\"file_url\":\"wnJzm7yXxxiFDrt.png\",\"relation_id\":\"6\",\"relation_type\":\"1\",\"cpation_name\":\"\\u886c\\u886b.png\",\"tocken\":\"aa3d003db56de326ed8586603cfd797b\",\"upload_date\":\"2017-07-14 18:06:16\"}]},{\"id\":\"427\",\"product_name\":\"BRACCIALETTI\",\"product_no\":\"781\",\"sale_price\":\"44.70000000\",\"sale_money\":\"0.000000000000000000000000\",\"sale_storeage\":\"5105.00000000\",\"dml_sale_price\":\"44.700\",\"edml_sale_price\":\"44.700\",\"dml_sale_money\":\"0.000\",\"edml_sale_money\":\"0.000\",\"is_new\":0,\"is_collect\":0,\"is_promotion\":0,\"pics_path\":\"\\/Runtime\\/Uploads\\/erp2200003\\/Product\\/\",\"pics\":[]},{\"id\":\"416\",\"product_name\":\"BRACCIALETTI\",\"product_no\":\"3301\",\"sale_price\":\"44.70000000\",\"sale_money\":\"0.000000000000000000000000\",\"sale_storeage\":\"3832.00000000\",\"dml_sale_price\":\"44.700\",\"edml_sale_price\":\"44.700\",\"dml_sale_money\":\"0.000\",\"edml_sale_money\":\"0.000\",\"is_new\":0,\"is_collect\":0,\"is_promotion\":0,\"pics_path\":\"\\/Runtime\\/Uploads\\/erp2200003\\/Product\\/\",\"pics\":[]},{\"id\":\"9\",\"product_name\":\"CATICIA\",\"product_no\":\"TE118Z\",\"sale_price\":\"38.70000000\",\"sale_money\":\"0.000000000000000000000000\",\"sale_storeage\":\"3200.00000000\",\"dml_sale_price\":\"38.700\",\"edml_sale_price\":\"38.700\",\"dml_sale_money\":\"0.000\",\"edml_sale_money\":\"0.000\",\"is_new\":0,\"is_collect\":0,\"is_promotion\":0,\"pics_path\":\"\\/Runtime\\/Uploads\\/erp2200003\\/Product\\/\",\"pics\":[]},{\"id\":\"438\",\"product_name\":\"\\u65f6\\u88c5\",\"product_no\":\"PR814-1\",\"sale_price\":\"47.40000000\",\"sale_money\":\"0.000000000000000000000000\",\"sale_storeage\":\"3200.00000000\",\"dml_sale_price\":\"47.400\",\"edml_sale_price\":\"47.400\",\"dml_sale_money\":\"0.000\",\"edml_sale_money\":\"0.000\",\"is_new\":1,\"is_collect\":1,\"is_promotion\":0,\"pics_path\":\"\\/Runtime\\/Uploads\\/erp2200003\\/Product\\/\",\"pics\":[]},{\"id\":\"414\",\"product_name\":\"BRACCIALETTI\",\"product_no\":\"3307\",\"sale_price\":\"44.70000000\",\"sale_money\":\"0.000000000000000000000000\",\"sale_storeage\":\"3178.00000000\",\"dml_sale_price\":\"44.700\",\"edml_sale_price\":\"44.700\",\"dml_sale_money\":\"0.000\",\"edml_sale_money\":\"0.000\",\"is_new\":0,\"is_collect\":0,\"is_promotion\":0,\"pics_path\":\"\\/Runtime\\/Uploads\\/erp2200003\\/Product\\/\",\"pics\":[]},{\"id\":\"22\",\"product_name\":\"CAPPOTTO\",\"product_no\":\"TE17572\",\"sale_price\":\"145.60000000\",\"sale_money\":\"0.000000000000000000000000\",\"sale_storeage\":\"2832.00000000\",\"dml_sale_price\":\"145.600\",\"edml_sale_price\":\"145.600\",\"dml_sale_money\":\"0.000\",\"edml_sale_money\":\"0.000\",\"is_new\":0,\"is_collect\":0,\"is_promotion\":0,\"pics_path\":\"\\/Runtime\\/Uploads\\/erp2200003\\/Product\\/\",\"pics\":[]},{\"id\":\"11\",\"product_name\":\"\\u886c\\u886b\",\"product_no\":\"TE116Z\",\"sale_price\":\"44.70000000\",\"sale_money\":\"0.000000000000000000000000\",\"sale_storeage\":\"2560.00000000\",\"dml_sale_price\":\"44.700\",\"edml_sale_price\":\"44.700\",\"dml_sale_money\":\"0.000\",\"edml_sale_money\":\"0.000\",\"is_new\":0,\"is_collect\":0,\"is_promotion\":0,\"pics_path\":\"\\/Runtime\\/Uploads\\/erp2200003\\/Product\\/\",\"pics\":[]},{\"id\":\"12\",\"product_name\":\"\\u886c\\u886b\",\"product_no\":\"TE070Z\",\"sale_price\":\"45.90000000\",\"sale_money\":\"0.000000000000000000000000\",\"sale_storeage\":\"2545.00000000\",\"dml_sale_price\":\"45.900\",\"edml_sale_price\":\"45.900\",\"dml_sale_money\":\"0.000\",\"edml_sale_money\":\"0.000\",\"is_new\":0,\"is_collect\":0,\"is_promotion\":0,\"pics_path\":\"\\/Runtime\\/Uploads\\/erp2200003\\/Product\\/\",\"pics\":[]},{\"id\":\"30\",\"product_name\":\"CAPPOTTI E PARKA\",\"product_no\":\"TET17008\",\"sale_price\":\"47.70000000\",\"sale_money\":\"0.000000000000000000000000\",\"sale_storeage\":\"2545.00000000\",\"dml_sale_price\":\"47.700\",\"edml_sale_price\":\"47.700\",\"dml_sale_money\":\"0.000\",\"edml_sale_money\":\"0.000\",\"is_new\":0,\"is_collect\":0,\"is_promotion\":0,\"pics_path\":\"\\/Runtime\\/Uploads\\/erp2200003\\/Product\\/\",\"pics\":[]},{\"id\":\"188\",\"product_name\":\"GIACCHE\",\"product_no\":\"T075TE\",\"sale_price\":\"44.70000000\",\"sale_money\":\"0.000000000000000000000000\",\"sale_storeage\":\"2543.00000000\",\"dml_sale_price\":\"44.700\",\"edml_sale_price\":\"44.700\",\"dml_sale_money\":\"0.000\",\"edml_sale_money\":\"0.000\",\"is_new\":0,\"is_collect\":0,\"is_promotion\":0,\"pics_path\":\"\\/Runtime\\/Uploads\\/erp2200003\\/Product\\/\",\"pics\":[]}],\"total\":{\"sale_money\":0,\"currency_id_sum\":{\"1\":{\"sale_money\":0,\"currency_no\":\"RMB\",\"dml_sale_money\":\"0.000\",\"dml_currency_no\":\"0\"}},\"dml_sale_money\":\"0.000\",\"dml_currency_id_rmb\":\"1\",\"total_product\":0}},\"request_id\":11874,\"status\":1,\"info\":\"\",\"fixed_config\":{\"version\":{\"version_number\":\"1.0.0\",\"forced_update\":1,\"version_update_title\":\"\",\"version_update_tips\":\"\"},\"version_key\":\"473895d6e3123ad85b6b459ab7032aa5\"}}";

    private RefreshRecyclerView refreshRecyclerView;
    private ProductListAdapter adapter;
    private List<Product> list = new ArrayList<>();
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        initData();
        initRecyclerView();

    }

    public void initData() {
        ProductListItem data = JsonParser.parserJson(json, ProductListItem.class);
        list = data.getRs().getList();
    }

    private void initRecyclerView() {
        refreshRecyclerView = (RefreshRecyclerView) findViewById(R.id.recycler_view);
        adapter = new ProductListAdapter(mContext, R.layout.item_list_product, true);
        adapter.setDataList(list);
        refreshRecyclerView.setAdapter(adapter);
        refreshRecyclerView.setPullRefreshEnable(true);
        refreshRecyclerView.setPullLoadEnable(true);
        refreshRecyclerView.setOnRefreshListener(new RefreshRecyclerView.OnRefreshListener() {
            @Override
            public void onRefresh() {

            }
        });
        refreshRecyclerView.setLoadMoreListener(new RefreshRecyclerView.LoadMoreListener() {
            @Override
            public void onLoadMore() {

            }
        });
    }
}
