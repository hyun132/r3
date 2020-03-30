package tpgus.example.com.rros;

import android.app.Application;

import java.util.ArrayList;

import tpgus.example.com.rros.basket.basketList;


/**
 * 앱 전역에서 사용할 수 있는 클래스
 */
public class MyApp extends Application {

    private MemberInfoItem memberInfoItem;

    private ArrayList<basketList> basketLists;

    @Override
    public void onCreate() {
        super.onCreate();

        // FileUriExposedException 문제를 해결하기 위한 코드
        // 관련 설명은 책의 [참고] 페이지 참고
//        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
//        StrictMode.setVmPolicy(builder.build());
    }

    public MemberInfoItem getMemberInfoItem() {
        return memberInfoItem;
    }

    public void setMemberInfoItem(MemberInfoItem item) {
        this.memberInfoItem = item;
    }


    public ArrayList<basketList> getBasketLists(){
        if(basketLists==null)
            basketLists=new ArrayList<basketList>();
        return basketLists;
    }

    public void setBasketLists(ArrayList<basketList> basketLists){
        this.basketLists=basketLists;
    }
}

