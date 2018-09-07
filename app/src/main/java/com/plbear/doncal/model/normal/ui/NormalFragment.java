package com.plbear.doncal.model.normal.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.plbear.doncal.R;
import com.plbear.doncal.model.base.BaseFragment;
import com.plbear.doncal.model.normal.data.Data;
import com.plbear.doncal.model.normal.presenter.NormalFragPerInerface;
import com.plbear.doncal.model.normal.presenter.NormalFragPersenter;

import butterknife.BindView;
import butterknife.OnClick;

public class NormalFragment extends BaseFragment implements NormalFragInterface{
    private NormalFragPerInerface mPresenter = new NormalFragPersenter();
    @BindView(R.id.btn_record) Button mBtnRecord;
    @BindView(R.id.btn_copy) Button mBtnCopy;
    @BindView(R.id.btn_paste) Button mBtnPaste;
    @BindView(R.id.btn_lucky) Button mBtnLucky;
    @BindView(R.id.btn_c) Button mBtnC;
    @BindView(R.id.btn_div) Button mBtnDiv;
    @BindView(R.id.btn_plus) Button mBtnPlus;
    @BindView(R.id.btn_del) Button mBtnDel;
    @BindView(R.id.btn_seven) Button mBtnSeven;
    @BindView(R.id.btn_six) Button mBtnSix;
    @BindView(R.id.btn_eight) Button mBtnEight;
    @BindView(R.id.btn_nine) Button mBtnNine;
    @BindView(R.id.btn_delete) Button mBtnDelete;
    @BindView(R.id.btn_four) Button mBtnFour;
    @BindView(R.id.btn_five) Button mBtnFive;
    @BindView(R.id.btn_mul) Button mBtnMul;
    @BindView(R.id.btn_one) Button mBtnOne;
    @BindView(R.id.btn_two) Button mBtnTwo;
    @BindView(R.id.btn_three) Button mBtnThree;
    @BindView(R.id.btn_equal) Button mBtnEqual;
    @BindView(R.id.btn_per) Button mBtnPer;
    @BindView(R.id.btn_zero) Button mBtnZero;
    @BindView(R.id.btn_point) Button mBtnPoint;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public int getLayout(){
        return R.layout.frag_normal_cal;
    }


    /**
     * flag:1 small,2 big
     * @param flag
     * @param result
     */
    @Override
    public void onResult(int flag,String result) {
        //TODO
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mPresenter.setView(this);
        init();
    }

    private void init(){
    }

    @OnClick(R.id.btn_zero)
    public void onClickZero(View v){
        Data data = Data.getData(Data.FLAG_NUM,0);
        mPresenter.addData(data);
    }

    @OnClick(R.id.btn_one)
    public void onClickOnce(View v){
        Data data = Data.getData(Data.FLAG_NUM,1);
        mPresenter.addData(data);
    }

    @OnClick(R.id.btn_two)
    public void onClickTwo(View v){
        Data data = Data.getData(Data.FLAG_NUM,2);
        mPresenter.addData(data);
    }

    @OnClick(R.id.btn_three)
    public void onClickThree(View v){
        Data data = Data.getData(Data.FLAG_NUM,3);
        mPresenter.addData(data);
    }

    @OnClick(R.id.btn_four)
    public void onClickFour(View v){
        Data data = Data.getData(Data.FLAG_NUM,4);
        mPresenter.addData(data);
    }

    @OnClick(R.id.btn_five)
    public void onClickFive(View v){
        Data data = Data.getData(Data.FLAG_NUM,5);
        mPresenter.addData(data);
    }

    @OnClick(R.id.btn_six)
    public void onClickSix(View v){
        Data data = Data.getData(Data.FLAG_NUM,6);
        mPresenter.addData(data);
    }

    @OnClick(R.id.btn_seven)
    public void onClickSeven(View v){
        Data data = Data.getData(Data.FLAG_NUM,7);
        mPresenter.addData(data);
    }

    @OnClick(R.id.btn_eight)
    public void onClickEight(View v){
        Data data = Data.getData(Data.FLAG_NUM,8);
        mPresenter.addData(data);
    }

    @OnClick(R.id.btn_nine)
    public void onClickNine(View v){
        Data data = Data.getData(Data.FLAG_NUM,9);
        mPresenter.addData(data);
    }

    @OnClick(R.id.btn_c)
    public void onClickC(View v){
        mPresenter.clear();
    }

    @OnClick(R.id.btn_div)
    public void onClickDiv(View v){
        Data data = Data.getData(Data.FLAG_OPERATOR,Data.OPERATOR_DIV);
        mPresenter.addData(data);
    }

    @OnClick(R.id.btn_mul)
    public void onClickMul(View v){
        Data data = Data.getData(Data.FLAG_OPERATOR,Data.OPERATOR_MUL);
        mPresenter.addData(data);
    }

    @OnClick(R.id.btn_plus)
    public void onClickPlus(View v){
        Data data = Data.getData(Data.FLAG_OPERATOR,Data.OPERATOR_PLUS);
        mPresenter.addData(data);
    }

    @OnClick(R.id.btn_del)
    public void onClickDel(View v){
        Data data = Data.getData(Data.FLAG_OPERATOR,Data.OPERATOR_DEL);
        mPresenter.addData(data);
    }

    @OnClick(R.id.btn_equal)
    public void onClickEqual(View v){
        mPresenter.getResult();
    }

    @OnClick(R.id.btn_point)
    public void onClickPoint(View v){
        Data data = Data.getData(Data.FLAG_OPERATOR,Data.OPERATOR_POINT);
        mPresenter.addData(data);
    }

    @OnClick(R.id.btn_delete)
    public void onClickDelete(View v){
        Data data = Data.getData(Data.FLAG_OPERATOR,Data.OPERATOR_DELETE_CHAR);
        mPresenter.addData(data);
    }
}
