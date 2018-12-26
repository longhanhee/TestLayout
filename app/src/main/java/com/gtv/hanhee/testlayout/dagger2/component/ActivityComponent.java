package com.gtv.hanhee.testlayout.dagger2.component;


import com.gtv.hanhee.testlayout.dagger2.PerActivity;
import com.gtv.hanhee.testlayout.dagger2.module.ActivityModule;
import com.gtv.hanhee.testlayout.ui.fragment.ShopHomeFragment;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    ShopHomeFragment inject(ShopHomeFragment shopHomeFragment);

}
