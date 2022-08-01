package br.ufsm.csi.pp.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Comando {
    public void executar(HttpServletRequest httpServletRequest, HttpServletResponse response);
}
