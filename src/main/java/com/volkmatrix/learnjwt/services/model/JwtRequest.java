package com.volkmatrix.learnjwt.services.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtRequest {

  @NonNull
  private String email;
  @NonNull
  private String password;
}
