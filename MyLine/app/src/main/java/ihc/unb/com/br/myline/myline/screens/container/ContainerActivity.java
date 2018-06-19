package ihc.unb.com.br.myline.myline.screens.container;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import ihc.unb.com.br.myline.R;
import ihc.unb.com.br.myline.myline.screens.container.restaurant.RestaurantFragment;

public class ContainerActivity extends AppCompatActivity {

    private RestaurantFragment restaurantFragment;
    private MyLineFragment myLineFragment;
    private NotificationsFragment notificationsFragment;
    private MenuFragment menuFragment;

    public BottomBar bottomBar;
    private android.support.v4.app.FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.container_activity);

        instantiateFragments();
        addFragments();

        findViewItems();
    }

    private void findViewItems() {
        bottomBar = (BottomBar) findViewById(R.id.bottom_bar);
        bottomBar.setOnTabSelectListener(tabListener);

//        setScale();
        bottomBar.getTabWithId(R.id.tab_home);
        bottomBar.getTabWithId(R.id.tab_line);
        bottomBar.getTabWithId(R.id.tab_notifications);
        bottomBar.getTabWithId(R.id.tab_menu);
    }

    private void instantiateFragments() {

        restaurantFragment = new RestaurantFragment();
        myLineFragment = new MyLineFragment();
        notificationsFragment = new NotificationsFragment();
        menuFragment = new MenuFragment();

    }

    private void addFragments() {
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.fragment_container, restaurantFragment).commit();
        fragmentManager.beginTransaction().add(R.id.fragment_container, myLineFragment).commit();
        fragmentManager.beginTransaction().add(R.id.fragment_container, notificationsFragment).commit();
        fragmentManager.beginTransaction().add(R.id.fragment_container, menuFragment).commit();
        //fm.beginTransaction().setCustomAnimations(R.anim.fragment_enter_from_right, R.anim.fragment_exit_to_left);
    }

    OnTabSelectListener tabListener = new OnTabSelectListener() {
        @Override
        public void onTabSelected(@IdRes int tabId) {
            switch (tabId) {
                case R.id.tab_home:
                    //mTitle.setText(getResources().getString(R.string.napkins_toolbar_title));
                    fragmentManager.beginTransaction().hide(menuFragment).hide(myLineFragment).hide(notificationsFragment).show(restaurantFragment).commit();

                    break;
                case R.id.tab_line:
                    fragmentManager.beginTransaction().hide(menuFragment).hide(notificationsFragment).hide(restaurantFragment).show(myLineFragment).commit();

                    break;
                case R.id.tab_notifications:
                    fragmentManager.beginTransaction().hide(menuFragment).hide(restaurantFragment).hide(myLineFragment).show(notificationsFragment).commit();

                    break;
                case R.id.tab_menu:
                    fragmentManager.beginTransaction().hide(myLineFragment).hide(restaurantFragment).hide(notificationsFragment).show(menuFragment).commit();
                    break;
            }
        }
    };

}
