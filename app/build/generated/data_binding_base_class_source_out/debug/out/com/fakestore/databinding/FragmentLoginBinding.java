// Generated by view binder compiler. Do not edit!
package com.fakestore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.fakestore.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView SignUpText;

  @NonNull
  public final MaterialButton loginButton;

  @NonNull
  public final TextInputEditText loginPassword;

  @NonNull
  public final ProgressBar loginProgressbar;

  @NonNull
  public final TextInputEditText loginUsername;

  @NonNull
  public final TextInputLayout passwordInputLayout;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextInputLayout usernameInputLayout;

  private FragmentLoginBinding(@NonNull ConstraintLayout rootView, @NonNull TextView SignUpText,
      @NonNull MaterialButton loginButton, @NonNull TextInputEditText loginPassword,
      @NonNull ProgressBar loginProgressbar, @NonNull TextInputEditText loginUsername,
      @NonNull TextInputLayout passwordInputLayout, @NonNull TextView textView,
      @NonNull TextInputLayout usernameInputLayout) {
    this.rootView = rootView;
    this.SignUpText = SignUpText;
    this.loginButton = loginButton;
    this.loginPassword = loginPassword;
    this.loginProgressbar = loginProgressbar;
    this.loginUsername = loginUsername;
    this.passwordInputLayout = passwordInputLayout;
    this.textView = textView;
    this.usernameInputLayout = usernameInputLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.SignUpText;
      TextView SignUpText = ViewBindings.findChildViewById(rootView, id);
      if (SignUpText == null) {
        break missingId;
      }

      id = R.id.loginButton;
      MaterialButton loginButton = ViewBindings.findChildViewById(rootView, id);
      if (loginButton == null) {
        break missingId;
      }

      id = R.id.login_password;
      TextInputEditText loginPassword = ViewBindings.findChildViewById(rootView, id);
      if (loginPassword == null) {
        break missingId;
      }

      id = R.id.login_progressbar;
      ProgressBar loginProgressbar = ViewBindings.findChildViewById(rootView, id);
      if (loginProgressbar == null) {
        break missingId;
      }

      id = R.id.login_username;
      TextInputEditText loginUsername = ViewBindings.findChildViewById(rootView, id);
      if (loginUsername == null) {
        break missingId;
      }

      id = R.id.passwordInputLayout;
      TextInputLayout passwordInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (passwordInputLayout == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.usernameInputLayout;
      TextInputLayout usernameInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (usernameInputLayout == null) {
        break missingId;
      }

      return new FragmentLoginBinding((ConstraintLayout) rootView, SignUpText, loginButton,
          loginPassword, loginProgressbar, loginUsername, passwordInputLayout, textView,
          usernameInputLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
