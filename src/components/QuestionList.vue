<template>
  <ul>
    <li>Wer ist der/die Größte?</li>
    <li>Diese Gäste kommen vorbei wenn es etwas zu heiß wird</li>
    <li>Mit welchem Gast habt ihr XY erlebt?</li>
    <li>Mit ihr wart ihr 2016 auf Rømø</li>
    <li>Er ist "der Wikinger"</li>
    <li v-for="(question, index) in questions">
    	{{ question.question }}
    </li>
    <li>
    	<form>
    		<input id="question-input" type="text" name="question" placeholder="Gib hier deine Frage ein" style="" />
    		<button type="button" @click="saveQuestion">Eintragen</button>
    	</form>
    </li>
  </ul>
</template>

<script>
import axios from 'axios'

export default {
  name: 'FeedbackForm',
  data: function() {
  	this.loadQuestions();
  	return {
  		questions: []
  	};
  },
  methods: {
  	loadQuestions: function() {
  		axios.get('/api/questions')
		.then(function (response) {
			console.log(response);
		   	questions = response;
		})
		.catch(function (error) {
		    console.log(error);
		});
  	},
  	saveQuestion: function(event) {
  		const questionInput = document.getElementById("question-input");
  		if (!!questionInput.value) {
  			axios.post('/api/questions', {
  				question: questionInput.value
  			})
  			.then(function (response) {
  				questionInput.value = "";
			    console.log(response);
			})
			.catch(function (error) {
			    console.log(error);
			});
		}
  	}
  }
}
</script>

<style type="text/css">
input {
	width: 300px;
	border: 0;
	border-bottom: 1px solid gray;
	font-size: 12pt;
	margin: 0 5px 0 0;
}
</style>