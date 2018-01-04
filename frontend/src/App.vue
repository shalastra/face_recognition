<template>
  <div id="app">
    <b-container fluid>
      <b-row align-h="center">
        <b-col cols="5">
          <webcam ref="webcam"></webcam>
        </b-col>
        <b-col cols="5">
          <img :src="this.img" style="margin-top:60px;width:500px;height:380px;"/>
        </b-col>
      </b-row>
      <b-row align-h="center">
        <b-col cols="2">
          <b-button type="button" @click="photo">Capture Photo</b-button>
        </b-col>
      </b-row>
    </b-container>
  </div>
</template>

<script>
  import Webcam from 'vue-web-cam/src/webcam'

  export default {
    name: 'app',
    data() {
      return {
        img: null
      }
    },
    methods: {
      photo() {
        this.img = this.$refs.webcam.capture()
      }
    },
    components: {
      Webcam
    }
  }
</script>

<style>
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    color: #2c3e50;
    margin-top: 60px;
  }
</style>
