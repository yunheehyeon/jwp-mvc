package nextstep.mvc;

import nextstep.HandlerAdapter;

import javax.servlet.http.HttpServletRequest;

public interface HandlerMapping {
    void initialize();

    Object getHandler(HttpServletRequest request);

    HandlerAdapter getHandlerAdapter();
}
