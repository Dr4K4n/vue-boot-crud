<template>
  <div id="app">
    <img src="./assets/wiebke_marvin.jpg" height="400">
    <hello-world newlyweds="Wiebke &amp; Marvin" weddingdate="01.06.2018">
      <h4>Wir brauchen eure Hilfe!</h4>
      <p>Auf der Hochzeitsfeier im <a href="http://www.ristorante-giuliano.de/" target="_blank">Ristorante Giuliano</a> möchten wir Wiebke &amp; Marvin dabei helfen die Gäste untereinander bekannt zu machen. Sie sollen anhand von kurzen Beschreibungen oder Fragen erraten welcher Gast oder auch welche Gäste gemeint sind und diese kurz vorstellen.</p>
      <p>Hierfür sind wir noch auf der Suche nach weiteren Beschreibungen und Fragen, z.B.</p>
      <question-list></question-list>
    </hello-world>
    <h4>Die Hochzeitsplaner</h4>
    <p>Silke &amp; Detlef, Renate &amp; Peter, Deike &amp; Stefan, Svenja, Cevin und Babette</p>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import QuestionList from './components/QuestionList.vue'

export default {
  name: 'app',
  components: {
    HelloWorld, QuestionList
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
