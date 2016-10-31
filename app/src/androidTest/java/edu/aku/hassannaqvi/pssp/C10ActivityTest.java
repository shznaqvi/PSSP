package edu.aku.hassannaqvi.pssp;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class C10ActivityTest {

    @Rule
    public ActivityTestRule<SplashScreenActivity> mActivityTestRule = new ActivityTestRule<>(SplashScreenActivity.class);

    @Test
    public void c10ActivityTest() {
        ViewInteraction autoCompleteTextView = onView(
                allOf(withId(R.id.email),
                        withParent(allOf(withId(R.id.email_login_form),
                                withParent(withId(R.id.login_form))))));
        autoCompleteTextView.perform(scrollTo(), click());

        ViewInteraction autoCompleteTextView2 = onView(
                allOf(withId(R.id.email),
                        withParent(allOf(withId(R.id.email_login_form),
                                withParent(withId(R.id.login_form))))));
        autoCompleteTextView2.perform(scrollTo(), click());

        ViewInteraction autoCompleteTextView3 = onView(
                allOf(withId(R.id.email),
                        withParent(allOf(withId(R.id.email_login_form),
                                withParent(withId(R.id.login_form))))));
        autoCompleteTextView3.perform(scrollTo(), click());

        ViewInteraction autoCompleteTextView4 = onView(
                allOf(withId(R.id.email),
                        withParent(allOf(withId(R.id.email_login_form),
                                withParent(withId(R.id.login_form))))));
        autoCompleteTextView4.perform(scrollTo(), replaceText("test1234"), closeSoftKeyboard());

        ViewInteraction editText = onView(
                allOf(withId(R.id.password),
                        withParent(allOf(withId(R.id.email_login_form),
                                withParent(withId(R.id.login_form))))));
        editText.perform(scrollTo(), replaceText("test1234"), closeSoftKeyboard());

        pressBack();

        ViewInteraction button = onView(
                allOf(withId(R.id.email_sign_in_button), withText("Login"),
                        withParent(allOf(withId(R.id.email_login_form),
                                withParent(withId(R.id.login_form))))));
        button.perform(scrollTo(), click());

        ViewInteraction button2 = onView(
                allOf(withId(R.id.openC), withText("Section C")));
        button2.perform(scrollTo(), click());

        ViewInteraction radioButton = onView(
                allOf(withId(R.id.mnc1a), withText("ہاں"),
                        withParent(withId(R.id.mnc1))));
        radioButton.perform(scrollTo(), click());

        ViewInteraction radioButton2 = onView(
                allOf(withId(R.id.mnc2a), withText("ہاں"),
                        withParent(withId(R.id.mnc2))));
        radioButton2.perform(scrollTo(), click());

        ViewInteraction radioButton3 = onView(
                allOf(withId(R.id.mnc3a), withText("ہاں"),
                        withParent(allOf(withId(R.id.mnc3),
                                withParent(withId(R.id.fldGrpmnc3))))));
        radioButton3.perform(scrollTo(), click());

        ViewInteraction editText2 = onView(
                withId(R.id.mnc5bcg));
        editText2.perform(scrollTo(), replaceText("0"), closeSoftKeyboard());

        ViewInteraction editText3 = onView(
                withId(R.id.mnc5opv0));
        editText3.perform(scrollTo(), replaceText("0"), closeSoftKeyboard());

        ViewInteraction editText4 = onView(
                withId(R.id.mnc5p1));
        editText4.perform(scrollTo(), replaceText("0"), closeSoftKeyboard());

        ViewInteraction editText5 = onView(
                withId(R.id.mnc5pcv1));
        editText5.perform(scrollTo(), replaceText("0"), closeSoftKeyboard());

        ViewInteraction editText6 = onView(
                withId(R.id.mnc5opv1));
        editText6.perform(scrollTo(), replaceText("0"), closeSoftKeyboard());

        ViewInteraction editText7 = onView(
                withId(R.id.mnc5p2));
        editText7.perform(scrollTo(), replaceText("0"), closeSoftKeyboard());

        ViewInteraction editText8 = onView(
                withId(R.id.mnc5pcv2));
        editText8.perform(scrollTo(), replaceText("0"), closeSoftKeyboard());

        ViewInteraction editText9 = onView(
                withId(R.id.mnc5opv2));
        editText9.perform(scrollTo(), replaceText("0"), closeSoftKeyboard());

        ViewInteraction editText10 = onView(
                withId(R.id.mnc5ipv1));
        editText10.perform(scrollTo(), replaceText("0"), closeSoftKeyboard());

        ViewInteraction editText11 = onView(
                withId(R.id.mnc5opv3));
        editText11.perform(scrollTo(), replaceText("0"), closeSoftKeyboard());

        ViewInteraction editText12 = onView(
                withId(R.id.mnc5pcv3));
        editText12.perform(scrollTo(), replaceText("0"), closeSoftKeyboard());

        ViewInteraction editText13 = onView(
                withId(R.id.mnc5p3));
        editText13.perform(scrollTo(), replaceText("0"), closeSoftKeyboard());

        ViewInteraction editText14 = onView(
                withId(R.id.mnc5m1));
        editText14.perform(scrollTo(), replaceText("0"), closeSoftKeyboard());

        ViewInteraction editText15 = onView(
                withId(R.id.mnc5ipv2));
        editText15.perform(scrollTo(), replaceText("0"), closeSoftKeyboard());

        ViewInteraction editText16 = onView(
                withId(R.id.mnc5m2));
        editText16.perform(scrollTo(), replaceText("0"), closeSoftKeyboard());

        ViewInteraction editText17 = onView(
                withId(R.id.mnc5ipv3));
        editText17.perform(scrollTo(), replaceText("0"), closeSoftKeyboard());

        ViewInteraction radioButton4 = onView(
                allOf(withId(R.id.mnc6a), withText("ہاں"),
                        withParent(withId(R.id.mnc6))));
        radioButton4.perform(scrollTo(), click());

        ViewInteraction editText18 = onView(
                allOf(withId(R.id.mnc8),
                        withParent(withId(R.id.fldGrpmnc8))));
        editText18.perform(scrollTo(), replaceText("55"), closeSoftKeyboard());

        ViewInteraction radioButton5 = onView(
                allOf(withId(R.id.mnc7a), withText("ہاں"),
                        withParent(withId(R.id.mnc7))));
        radioButton5.perform(scrollTo(), click());

        ViewInteraction radioButton6 = onView(
                allOf(withId(R.id.mnc9a), withText("ہاں"),
                        withParent(withId(R.id.mnc9))));
        radioButton6.perform(scrollTo(), click());

        ViewInteraction editText19 = onView(
                withId(R.id.mnc10yy));
        editText19.perform(scrollTo(), replaceText("2015"), closeSoftKeyboard());

        ViewInteraction editText20 = onView(
                withId(R.id.mnc10mm));
        editText20.perform(scrollTo(), replaceText("12"), closeSoftKeyboard());

        ViewInteraction radioButton7 = onView(
                allOf(withId(R.id.mnc11a), withText("سرکاری مرکز صحت"),
                        withParent(allOf(withId(R.id.mnc11),
                                withParent(withId(R.id.fldGrpmnc10))))));
        radioButton7.perform(scrollTo(), click());

        ViewInteraction radioButton8 = onView(
                allOf(withId(R.id.mnc12a), withText("ہاں"),
                        withParent(withId(R.id.mnc12))));
        radioButton8.perform(scrollTo(), click());

        ViewInteraction radioButton9 = onView(
                allOf(withId(R.id.mnc13a), withText("ہاں"),
                        withParent(withId(R.id.mnc13))));
        radioButton9.perform(scrollTo(), click());

        ViewInteraction button3 = onView(
                withText("اگلا سیکشن"));
        button3.perform(scrollTo(), click());

    }

}
