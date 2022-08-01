package br.ufsm.csi.pp.command;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PadinaUm implements Comando{
    @Override
    public void executar(HttpServletRequest httpServletRequest, HttpServletResponse response) {
        try {
            RequestDispatcher dispatcher = httpServletRequest.getRequestDispatcher("/paginaUm.jsp");
            dispatcher.forward(httpServletRequest, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
