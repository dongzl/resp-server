/*
 * Copyright (c) 2016-2017, Antonio Gabriel Muñoz Conejo <antoniogmc at gmail dot com>
 * Distributed under the terms of the MIT License
 */
package com.github.tonivade.resp.protocol;

import com.github.tonivade.resp.protocol.AbstractRedisToken.ArrayRedisToken;
import com.github.tonivade.resp.protocol.AbstractRedisToken.ErrorRedisToken;
import com.github.tonivade.resp.protocol.AbstractRedisToken.IntegerRedisToken;
import com.github.tonivade.resp.protocol.AbstractRedisToken.StatusRedisToken;
import com.github.tonivade.resp.protocol.AbstractRedisToken.StringRedisToken;
import com.github.tonivade.resp.protocol.AbstractRedisToken.UnknownRedisToken;

public interface RedisTokenVisitor<T> {
  T array(ArrayRedisToken token);
  T status(StatusRedisToken token);
  T string(StringRedisToken token);
  T error(ErrorRedisToken token);
  T unknown(UnknownRedisToken token);
  T integer(IntegerRedisToken token);
}
