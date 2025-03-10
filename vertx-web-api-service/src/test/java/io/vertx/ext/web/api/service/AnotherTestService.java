package io.vertx.ext.web.api.service;

import io.vertx.codegen.annotations.ProxyClose;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.validation.RequestParameter;

@WebApiServiceGen
public
interface AnotherTestService {

  @Deprecated
  void testC(ServiceRequest context, Handler<AsyncResult<ServiceResponse>> resultHandler);

  @Deprecated
  void testD(ServiceRequest context, Handler<AsyncResult<ServiceResponse>> resultHandler);

  @Deprecated
  void testE(Integer id, JsonObject body, ServiceRequest context, Handler<AsyncResult<ServiceResponse>> resultHandler);

  @Deprecated
  void testF(Integer id, RequestParameter body, ServiceRequest context, Handler<AsyncResult<ServiceResponse>> resultHandler);

  @Deprecated
  void testDataObject(FilterData body, ServiceRequest context, Handler<AsyncResult<ServiceResponse>> resultHandler);

  @ProxyClose
  void close();

  static AnotherTestService create(Vertx vertx) {
    return new AnotherTestServiceImpl(vertx);
  }

}
