from flask import Flask
from flask import render_template

app=Flask("__name__")

@app.route("/")
def pag_inicial():
    return render_template("paginainicial.html")

@app.route("/quemsomos")
def quem_somos():
    return render_template("quemsomos.html")

@app.route("/contatos")
def contatos():
    return render_template("contato.html")