package com.ztt.test.callback.template;

import com.ztt.test.callback.metod.Test;

public interface PersonCallBack<T> {
	T doGet(Test test);
}
